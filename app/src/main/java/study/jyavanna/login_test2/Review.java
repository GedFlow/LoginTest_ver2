package study.jyavanna.login_test2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Review extends AppCompatActivity {

    String TAG = "테스트";

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    Button btnReview;
    TextView txtTitle;
    RatingBar rateStar;
    EditText edtUser;
    EditText edtReview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        String docStr = "치즈돈까스";
        btnReview = (Button) findViewById(R.id.btnReview);

        txtTitle = (TextView)findViewById(R.id.rTitle);
        rateStar = (RatingBar)findViewById(R.id.rRating);
        edtUser = (EditText)findViewById(R.id.rUser);
        edtReview = (EditText)findViewById(R.id.rReview);



        btnReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float star = rateStar.getRating();
                String title = txtTitle.getText().toString();
                String user = edtUser.getText().toString();
                String review = edtReview.getText().toString();

                Map<String, Object> docStr = new HashMap<>();
                docStr.put("별점", star);
                docStr.put("닉네임", user);
                docStr.put("리뷰내용", review);

                db.collection(title).document(user)
                        .set(docStr)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                                Log.d(TAG, "DocumentSnapshot successfully written!");
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Log.w(TAG, "Error writing document", e);
                            }
                        });
            }
        });

    }
}
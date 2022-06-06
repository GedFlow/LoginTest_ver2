package study.jyavanna.login_test2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.HashMap;
import java.util.Map;

public class Review extends AppCompatActivity {

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    Button btnReview;
    TextView txtTitle;
    RatingBar rateStar;
    EditText edtUser;
    EditText edtReview;

    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        Intent i1 = getIntent();
        String name = i1.getExtras().getString("name");

        String TAG = name;

        String docStr = "치즈돈까스";
        btnReview = (Button) findViewById(R.id.btnReview);

        txtTitle = (TextView)findViewById(R.id.rTitle);
        rateStar = (RatingBar)findViewById(R.id.rRating);
        edtUser = (EditText)findViewById(R.id.rUser);
        edtReview = (EditText)findViewById(R.id.rReview);

        db.collection(name)
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            int nameCounter = 0;
                            int starCounter = 0;
                            int reviewCounter = 0;
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                //파이어베이스 스토어에서 각각의 문서의 필드를 가져옴
                                String userName = document.getData().get("name").toString();
                                String userReview = document.getData().get("review").toString();
                                float userStar = Float.parseFloat(document.getData().get("star").toString());

                                Sub myLayout = new Sub(getApplicationContext());
                                LinearLayout parent = (LinearLayout)findViewById(R.id.parentLayout);
                                parent.addView(myLayout);

                                TextView txtName = (TextView) findViewById(R.id.name0);
                                RatingBar ratStar = (RatingBar) findViewById(R.id.star0);
                                TextView txtReview = (TextView) findViewById(R.id.review0);
                                txtName.setText(userName);
                                ratStar.setRating(userStar);
                                txtReview.setText(" >>  " + userReview);

                                txtName.setId(nameCounter++);
                                ratStar.setId(starCounter++);
                                txtReview.setId(reviewCounter++);
                            }
                        } else {
                            Log.e(TAG, "Error getting documents: ", task.getException());
                        }
                    }
                });


        btnReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float star = rateStar.getRating();
                String title = txtTitle.getText().toString();
                String user = edtUser.getText().toString();
                String review = edtReview.getText().toString();

                Map<String, Object> docStr = new HashMap<>();
                docStr.put("star", star);
                docStr.put("name", user);
                docStr.put("review", review);

                db.collection(title).document(user)
                        .set(docStr)
                        .addOnSuccessListener(new OnSuccessListener<Void>() {
                            @Override
                            public void onSuccess(Void aVoid) {
                                Log.d(TAG, "DocumentSnapshot successfully written!");
                                finish();
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
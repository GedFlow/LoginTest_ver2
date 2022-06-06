package study.jyavanna.login_test2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

public class Fragcafe_global extends Fragment {

    FirebaseFirestore db = FirebaseFirestore.getInstance();
    String TAG = "교수회관";
    int counter = 0;
    float avgStar = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragcafe_global, container, false);

        TextView koreanBuffet = (TextView)view.findViewById(R.id.한식뷔페);
        TextView star = (TextView)view.findViewById(R.id.koreanfoodStar);
        TextView review = (TextView)view.findViewById(R.id.koreanfoodReview);
        String a1 = koreanBuffet.getText().toString();
        result(star, review, a1); //만든 함수
        koreanBuffet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a1);
                getActivity().startActivity(i1);
            }
        });

        return view;
    }

    //데이터 읽어와서 총 리뷰 개수를 구하고 리뷰 별점의 평균을 구하는 함수
    void result(TextView cdStar, TextView cdReview, String a) {
        db.collection(a)
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            counter = 0;
                            avgStar = 0;
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                Log.d(TAG, document.getId() + " => " + document.getData());
                                avgStar += Float.parseFloat(document.getData().get("star").toString());
                                counter++;
                            }
                        } else {
                            Log.d(TAG, "Error getting documents: ", task.getException());
                        }
                        avgStar = avgStar/counter;
                        if(Float.isNaN(avgStar)) {
                            avgStar = 0;
                        }
                        cdStar.setText(String.format("%.1f", avgStar));
                        cdReview.setText("등록된 리뷰: " + Integer.toString(counter) + "건");
                    }
                });
    }
}
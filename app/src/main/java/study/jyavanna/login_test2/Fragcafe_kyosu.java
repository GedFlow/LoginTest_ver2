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
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import org.w3c.dom.Text;

public class Fragcafe_kyosu extends Fragment {

    FirebaseFirestore db = FirebaseFirestore.getInstance();
    String TAG = "교수회관";
    int counter = 0;
    float avgStar = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_fragcafe_kyosu, container, false);

        TextView cd = (TextView)view.findViewById(R.id.cheezeDonga);
        TextView star = (TextView)view.findViewById(R.id.cheezeDongaStar);
        TextView review = (TextView)view.findViewById(R.id.cheezeDongaReview);
        String a = cd.getText().toString();
        result(star, review, a); //만든 함수
        cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a);
                getActivity().startActivity(i1);
            }
        });

        TextView cg = (TextView)view.findViewById(R.id.chikenGas);
        TextView star1 = (TextView)view.findViewById(R.id.chikenGasStar);
        TextView review1 = (TextView)view.findViewById(R.id.chikenGasReview);
        String a1 = cg.getText().toString();
        result(star1, review1, a1); //만든 함수
        cg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a1);
                getActivity().startActivity(i1);
            }
        });

        TextView ab = (TextView)view.findViewById(R.id.albob);
        TextView star2 = (TextView)view.findViewById(R.id.albobStar);
        TextView review2 = (TextView)view.findViewById(R.id.albobReview);
        String a2 = ab.getText().toString();
        result(star2, review2, a2); //만든 함수
        ab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a2);
                getActivity().startActivity(i1);
            }
        });

        TextView bs = (TextView)view.findViewById(R.id.bossam);
        TextView star3 = (TextView)view.findViewById(R.id.bossamStar);
        TextView review3 = (TextView)view.findViewById(R.id.bossamReview);
        String a3 = bs.getText().toString();
        result(star3, review3, a3); //만든 함수
        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a3);
                getActivity().startActivity(i1);
            }
        });

        TextView tuna = (TextView)view.findViewById(R.id.tuna);
        TextView star4 = (TextView)view.findViewById(R.id.tunaStar);
        TextView review4 = (TextView)view.findViewById(R.id.tunaReview);
        String a4 = tuna.getText().toString();
        result(star4, review4, a4); //만든 함수
        tuna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a4);
                getActivity().startActivity(i1);
            }
        });

        TextView gb = (TextView)view.findViewById(R.id.gogibob);
        TextView star5 = (TextView)view.findViewById(R.id.gogibobStar);
        TextView review5 = (TextView)view.findViewById(R.id.gogibobReview);
        String a5 = gb.getText().toString();
        result(star5, review5, a5); //만든 함수
        gb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a5);
                getActivity().startActivity(i1);
            }
        });

        TextView buffet = (TextView)view.findViewById(R.id.buffet);
        TextView star6 = (TextView)view.findViewById(R.id.buffetStar);
        TextView review6 = (TextView)view.findViewById(R.id.buffetReview);
        String a6 = buffet.getText().toString();
        result(star6, review6, a6); //만든 함수
        buffet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a6);
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
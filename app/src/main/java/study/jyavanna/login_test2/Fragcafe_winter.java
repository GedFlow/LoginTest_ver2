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

public class Fragcafe_winter extends Fragment {

    FirebaseFirestore db = FirebaseFirestore.getInstance();
    String TAG = "교수회관";
    int counter = 0;
    float avgStar = 0;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragcafe_winter, container, false);

        TextView sc = (TextView)view.findViewById(R.id.사골칼국수);
        TextView star1 = (TextView)view.findViewById(R.id.sagolcalStar);
        TextView review1 = (TextView)view.findViewById(R.id.sagolcalReview);
        String a1 = sc.getText().toString();
        result(star1, review1, a1); //만든 함수
        sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a1);
                getActivity().startActivity(i1);
            }
        });

        TextView ccc = (TextView)view.findViewById(R.id.칼칼칼국수);
        TextView star2 = (TextView)view.findViewById(R.id.ulcalStar);
        TextView review2 = (TextView)view.findViewById(R.id.ulcalReview);
        String a2 = ccc.getText().toString();
        result(star2, review2, a2); //만든 함수
        ccc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a2);
                getActivity().startActivity(i1);
            }
        });

        TextView cm = (TextView)view.findViewById(R.id.칼만두국);
        TextView star3 = (TextView)view.findViewById(R.id.calmanduStar);
        TextView review3 = (TextView)view.findViewById(R.id.calmanduReview);
        String a3 = cm.getText().toString();
        result(star3, review3, a3); //만든 함수
        cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a3);
                getActivity().startActivity(i1);
            }
        });

        TextView ssg = (TextView)view.findViewById(R.id.사골시락국밥);
        TextView star4 = (TextView)view.findViewById(R.id.sirakStar);
        TextView review4 = (TextView)view.findViewById(R.id.sirakReview);
        String a4 = ssg.getText().toString();
        result(star4, review4, a4); //만든 함수
        ssg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a4);
                getActivity().startActivity(i1);
            }
        });

        TextView usg = (TextView)view.findViewById(R.id.우삼겹시락국밥);
        TextView star5 = (TextView)view.findViewById(R.id.gogisirakStar);
        TextView review5 = (TextView)view.findViewById(R.id.gogisirakReview);
        String a5 = usg.getText().toString();
        result(star5, review5, a5); //만든 함수
        usg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a5);
                getActivity().startActivity(i1);
            }
        });

        TextView uusg = (TextView)view.findViewById(R.id.얼큰우삼겹시락국밥);
        TextView star6 = (TextView)view.findViewById(R.id.ulgogisirakStar);
        TextView review6 = (TextView)view.findViewById(R.id.ulgogisirakReview);
        String a6 = uusg.getText().toString();
        result(star6, review6, a6); //만든 함수
        uusg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a6);
                getActivity().startActivity(i1);
            }
        });

        TextView sb = (TextView)view.findViewById(R.id.시락비빔밥);
        TextView star7 = (TextView)view.findViewById(R.id.bibimStar);
        TextView review7 = (TextView)view.findViewById(R.id.bibimReview);
        String a7 = sb.getText().toString();
        result(star7, review7, a7); //만든 함수
        sb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a7);
                getActivity().startActivity(i1);
            }
        });

        TextView bdb = (TextView)view.findViewById(R.id.불제육덮밥);
        TextView star8 = (TextView)view.findViewById(R.id.bulStar);
        TextView review8 = (TextView)view.findViewById(R.id.bulReview);
        String a8 = bdb.getText().toString();
        result(star8, review8, a8); //만든 함수
        bdb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a8);
                getActivity().startActivity(i1);
            }
        });

        TextView yug = (TextView)view.findViewById(R.id.옛날육개장);
        TextView star9 = (TextView)view.findViewById(R.id.yetStar);
        TextView review9 = (TextView)view.findViewById(R.id.yetReview);
        String a9 = yug.getText().toString();
        result(star9, review9, a9); //만든 함수
        yug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a9);
                getActivity().startActivity(i1);
            }
        });

        TextView dmg = (TextView)view.findViewById(R.id.떡만두국);
        TextView star10 = (TextView)view.findViewById(R.id.duckStar);
        TextView review10 = (TextView)view.findViewById(R.id.duckReview);
        String a10 = dmg.getText().toString();
        result(star10, review10, a10); //만든 함수
        dmg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a10);
                getActivity().startActivity(i1);
            }
        });

        TextView snm = (TextView)view.findViewById(R.id.시원냉모밀);
        TextView star11 = (TextView)view.findViewById(R.id.momilStar);
        TextView review11 = (TextView)view.findViewById(R.id.momilReview);
        String a11 = snm.getText().toString();
        result(star11, review11, a11); //만든 함수
        snm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a11);
                getActivity().startActivity(i1);
            }
        });

        TextView bnm = (TextView)view.findViewById(R.id.비빔냉모밀);
        TextView star12 = (TextView)view.findViewById(R.id.bibimmomilStar);
        TextView review12 = (TextView)view.findViewById(R.id.bibimmomilReview);
        String a12 = bnm.getText().toString();
        result(star12, review12, a12); //만든 함수
        bnm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a12);
                getActivity().startActivity(i1);
            }
        });

        TextView mggm = (TextView)view.findViewById(R.id.명품찐만두);
        TextView star13 = (TextView)view.findViewById(R.id.zinmanduStar);
        TextView review13 = (TextView)view.findViewById(R.id.zinmanduReview);
        String a13 = mggm.getText().toString();
        result(star13, review13, a13); //만든 함수
        mggm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a13);
                getActivity().startActivity(i1);
            }
        });

        TextView gm = (TextView)view.findViewById(R.id.갈비만두);
        TextView star14 = (TextView)view.findViewById(R.id.galbiStar);
        TextView review14 = (TextView)view.findViewById(R.id.galbiReview);
        String a14 = gm.getText().toString();
        result(star14, review14, a14); //만든 함수
        gm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a14);
                getActivity().startActivity(i1);
            }
        });

        TextView cgm = (TextView)view.findViewById(R.id.철판군만두);
        TextView star15 = (TextView)view.findViewById(R.id.gunmanduStar);
        TextView review15 = (TextView)view.findViewById(R.id.gunmanduReview);
        String a15 = cgm.getText().toString();
        result(star15, review15, a15); //만든 함수
        cgm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a15);
                getActivity().startActivity(i1);
            }
        });

        TextView gddg = (TextView)view.findViewById(R.id.궁중떡갈비);
        TextView star16 = (TextView)view.findViewById(R.id.duckgalbiStar);
        TextView review16 = (TextView)view.findViewById(R.id.duckgalbiReview);
        String a16 = gddg.getText().toString();
        result(star16, review16, a16); //만든 함수
        gddg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a16);
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
package study.jyavanna.login_test2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragcafe_winter extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragcafe_winter, container, false);

        TextView sc = (TextView)view.findViewById(R.id.사골칼국수);
        String a1 = sc.getText().toString();
        sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a1);
                getActivity().startActivity(i1);
            }
        });

        TextView ccc = (TextView)view.findViewById(R.id.칼칼칼국수);
        String a2 = ccc.getText().toString();
        ccc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a2);
                getActivity().startActivity(i1);
            }
        });

        TextView cm = (TextView)view.findViewById(R.id.칼만두국);
        String a3 = cm.getText().toString();
        cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a3);
                getActivity().startActivity(i1);
            }
        });

        TextView ssg = (TextView)view.findViewById(R.id.사골시락국밥);
        String a4 = ssg.getText().toString();
        ssg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a4);
                getActivity().startActivity(i1);
            }
        });

        TextView usg = (TextView)view.findViewById(R.id.우삼겹시락국밥);
        String a5 = usg.getText().toString();
        usg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a5);
                getActivity().startActivity(i1);
            }
        });

        TextView uusg = (TextView)view.findViewById(R.id.얼큰우삼겹시락국밥);
        String a6 = uusg.getText().toString();
        uusg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a6);
                getActivity().startActivity(i1);
            }
        });

        TextView sb = (TextView)view.findViewById(R.id.시락비빔밥);
        String a7 = sb.getText().toString();
        sb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a7);
                getActivity().startActivity(i1);
            }
        });

        TextView bdb = (TextView)view.findViewById(R.id.불제육덮밥);
        String a8 = bdb.getText().toString();
        bdb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a8);
                getActivity().startActivity(i1);
            }
        });

        TextView yug = (TextView)view.findViewById(R.id.옛날육개장);
        String a9 = yug.getText().toString();
        yug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a9);
                getActivity().startActivity(i1);
            }
        });

        TextView dmg = (TextView)view.findViewById(R.id.떡만두국);
        String a10 = dmg.getText().toString();
        dmg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a10);
                getActivity().startActivity(i1);
            }
        });

        TextView snm = (TextView)view.findViewById(R.id.시원냉모밀);
        String a11 = snm.getText().toString();
        snm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a11);
                getActivity().startActivity(i1);
            }
        });

        TextView bnm = (TextView)view.findViewById(R.id.비빔냉모밀);
        String a12 = bnm.getText().toString();
        bnm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a12);
                getActivity().startActivity(i1);
            }
        });

        TextView mggm = (TextView)view.findViewById(R.id.명품찐만두);
        String a13 = mggm.getText().toString();
        mggm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a13);
                getActivity().startActivity(i1);
            }
        });

        TextView gm = (TextView)view.findViewById(R.id.갈비만두);
        String a14 = gm.getText().toString();
        gm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a14);
                getActivity().startActivity(i1);
            }
        });

        TextView cgm = (TextView)view.findViewById(R.id.철판군만두);
        String a15 = cgm.getText().toString();
        cgm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a15);
                getActivity().startActivity(i1);
            }
        });

        TextView gddg = (TextView)view.findViewById(R.id.궁중떡갈비);
        String a16 = gddg.getText().toString();
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
}
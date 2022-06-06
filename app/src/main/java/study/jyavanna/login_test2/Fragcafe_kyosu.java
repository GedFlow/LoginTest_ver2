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
import android.widget.Button;
import android.widget.TextView;

public class Fragcafe_kyosu extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_fragcafe_kyosu, container, false);

        TextView cd = (TextView)view.findViewById(R.id.cheezeDonga);
        String a = cd.getText().toString();
        cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a);
                getActivity().startActivity(i1);
            }
        });

        TextView cg = (TextView)view.findViewById(R.id.chikenGas);
        String a1 = cg.getText().toString();
        cg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a1);
                getActivity().startActivity(i1);
            }
        });

        TextView ab = (TextView)view.findViewById(R.id.albob);
        String a2 = ab.getText().toString();
        ab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a2);
                getActivity().startActivity(i1);
            }
        });

        TextView bs = (TextView)view.findViewById(R.id.bossam);
        String a3 = bs.getText().toString();
        bs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a3);
                getActivity().startActivity(i1);
            }
        });

        TextView tuna = (TextView)view.findViewById(R.id.tuna);
        String a4 = tuna.getText().toString();
        tuna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a4);
                getActivity().startActivity(i1);
            }
        });

        TextView gb = (TextView)view.findViewById(R.id.gogibob);
        String a5 = gb.getText().toString();
        gb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a5);
                getActivity().startActivity(i1);
            }
        });

        TextView buffet = (TextView)view.findViewById(R.id.buffet);
        String a6 = buffet.getText().toString();
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


}
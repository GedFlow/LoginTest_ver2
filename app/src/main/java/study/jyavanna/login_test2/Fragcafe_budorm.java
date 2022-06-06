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

public class Fragcafe_budorm extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragcafe_budorm, container, false);

        TextView budormBuffet = (TextView)view.findViewById(R.id.백석생활관뷔페);
        String a1 = budormBuffet.getText().toString();
        budormBuffet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getActivity(), Review.class);
                i1.putExtra("name", a1);
                getActivity().startActivity(i1);
            }
        });

        return view;
    }
}
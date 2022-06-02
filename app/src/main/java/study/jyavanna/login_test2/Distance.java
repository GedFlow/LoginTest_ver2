package study.jyavanna.login_test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Distance extends AppCompatActivity {
    TextView textview1, textview2, textview3;


    Button btnBD1;
    Button btnBD2;
    Button btnBD3;
    Button btnBD4;
    Button btnBD5;
    Button btnBD6;
    Button btnBD7;
    Button btnBD8;
    Button btnBD9;
    Button btnBD10;
    Button btnBD11;
    Button btnBD12;
    Button btnBD13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance);

        btnBD1 = (Button) findViewById(R.id.btnBD1);
        btnBD2 = (Button) findViewById(R.id.btnBD2);
        btnBD3 = (Button) findViewById(R.id.btnBD3);
        btnBD4 = (Button) findViewById(R.id.btnBD4);
        btnBD5 = (Button) findViewById(R.id.btnBD5);
        btnBD6 = (Button) findViewById(R.id.btnBD6);
        btnBD7 = (Button) findViewById(R.id.btnBD7);
        btnBD8 = (Button) findViewById(R.id.btnBD8);
        btnBD9 = (Button) findViewById(R.id.btnBD9);
        btnBD10 = (Button) findViewById(R.id.btnBD10);
        btnBD11 = (Button) findViewById(R.id.btnBD11);
        btnBD12 = (Button) findViewById(R.id.btnBD12);
        btnBD13 = (Button) findViewById(R.id.btnBD13);

        btnBD1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Distance.this, WebBD1.class);
                startActivity(i1);
            }
        });

    }

}

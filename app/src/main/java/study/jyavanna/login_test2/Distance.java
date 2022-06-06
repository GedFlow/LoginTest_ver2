package study.jyavanna.login_test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Distance extends AppCompatActivity {
    TextView textview1, textview2, textview3;


    ImageButton btnBD1;
    ImageButton btnBD2;
    ImageButton btnBD3;
    ImageButton btnBD4;
    ImageButton btnBD5;
    ImageButton btnBD6;
    ImageButton btnBD7;
    ImageButton btnBD8;
    ImageButton btnBD9;
    ImageButton btnBD10;
    ImageButton btnBD11;
    ImageButton btnBD12;
    ImageButton btnBD13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance);

        btnBD1 = (ImageButton) findViewById(R.id.btnBD1);
        btnBD2 = (ImageButton) findViewById(R.id.btnBD2);
        btnBD3 = (ImageButton) findViewById(R.id.btnBD3);
        btnBD4 = (ImageButton) findViewById(R.id.btnBD4);
        btnBD5 = (ImageButton) findViewById(R.id.btnBD5);
        btnBD6 = (ImageButton) findViewById(R.id.btnBD6);
        btnBD7 = (ImageButton) findViewById(R.id.btnBD7);
        btnBD8 = (ImageButton) findViewById(R.id.btnBD8);
        btnBD9 = (ImageButton) findViewById(R.id.btnBD9);
        btnBD10 = (ImageButton) findViewById(R.id.btnBD10);
        btnBD11 = (ImageButton) findViewById(R.id.btnBD11);
        btnBD12 = (ImageButton) findViewById(R.id.btnBD12);
        btnBD13 = (ImageButton) findViewById(R.id.btnBD13);

        btnBD1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Distance.this, WebBD1.class);
                startActivity(i1);
            }
        });

        btnBD2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), WebBD2.class);
                startActivity(i1);
            }
        });
        btnBD3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Distance.this, WebBD3.class);
                startActivity(i1);
            }
        });
        btnBD4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Distance.this, WebBD4.class);
                startActivity(i1);
            }
        });
        btnBD5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Distance.this, WebBD5.class);
                startActivity(i1);
            }
        });
        btnBD6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Distance.this, WebBD6.class);
                startActivity(i1);
            }
        });
        btnBD7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Distance.this, WebBD7.class);
                startActivity(i1);
            }
        });
        btnBD8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Distance.this, WebBD8.class);
                startActivity(i1);
            }
        });
        btnBD9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Distance.this, WebBD9.class);
                startActivity(i1);
            }
        });
        btnBD10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Distance.this, WebBD10.class);
                startActivity(i1);
            }
        });
        btnBD11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Distance.this, WebBD11.class);
                startActivity(i1);
            }
        });
        btnBD12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Distance.this, WebBD12.class);
                startActivity(i1);
            }
        });
        btnBD13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Distance.this, WebBD13.class);
                startActivity(i1);
            }
        });


    }

}

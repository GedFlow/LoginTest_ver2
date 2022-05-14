package study.jyavanna.login_test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCafe;
    Button btnDistance;
    Button btnBus;
    Button btnHouse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCafe = (Button) findViewById(R.id.btnCafe);
        btnDistance = (Button) findViewById(R.id.btnDistance);
        btnBus = (Button) findViewById(R.id.btnBus);
        btnHouse = (Button) findViewById(R.id.btnHouse);

        btnCafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1;
                i1 = new Intent(getApplicationContext(), Cafeteria.class);
                startActivity(i1);
            }
        });

        btnDistance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1;
                i1 = new Intent(getApplicationContext(), Distance.class);
                startActivity(i1);
            }
        });

        btnBus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1;
                i1 = new Intent(getApplicationContext(), Bus.class);
                startActivity(i1);
            }
        });

        btnHouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1;
                i1 = new Intent(getApplicationContext(), House.class);
                startActivity(i1);
            }
        });

    }
}
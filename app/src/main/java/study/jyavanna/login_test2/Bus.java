package study.jyavanna.login_test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bus extends AppCompatActivity {

    Button btnBus1;
    Button btnBus2;
    Button btnBus3;
    Button btnBus4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bus);

        btnBus1 = (Button) findViewById(R.id.bus1);
        btnBus2 = (Button) findViewById(R.id.bus2);
        btnBus3 = (Button) findViewById(R.id.bus3);
        btnBus4 = (Button) findViewById(R.id.bus4);

        btnBus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), Web1.class);
                startActivity(i1);
            }
        });

        btnBus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), Web2.class);
                startActivity(i1);
            }
        });

        btnBus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), Web3.class);
                startActivity(i1);
            }
        });

        btnBus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), Web4.class);
                startActivity(i1);
            }
        });

    }
}
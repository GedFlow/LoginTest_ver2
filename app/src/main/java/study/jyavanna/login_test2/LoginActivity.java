package study.jyavanna.login_test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    SQLiteDatabase db = null;
    Button btnRegist;
    Button btnLogin;

    EditText userNumber;
    EditText userPass;

    DBHelper helper;
    SQLiteDatabase database;

    String sql;
    Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        helper = new DBHelper(this);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnRegist = (Button) findViewById(R.id.btnRegist);
        userNumber = (EditText) findViewById(R.id.idText);
        userPass = (EditText) findViewById(R.id.passwordText);

        btnRegist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1;
                i1 = new Intent(getApplicationContext(), RegistActivity.class);
                startActivity(i1);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String userId = userNumber.getText().toString();
                String userPassword = userPass.getText().toString();

                if(userId.length() == 0 || userPassword.length() == 0){
                    Toast.makeText(LoginActivity.this, "아이디와 비밀번호를 입력하세요", Toast.LENGTH_SHORT).show();
                    return;
                }

                if(helper != null && helper.checkLogin(userId, userPassword)) {
                    Intent i1;
                    i1 = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i1);
                } else {
                    Toast.makeText(LoginActivity.this, "잘못된 회원정보입니다.", Toast.LENGTH_SHORT).show();
                    return;
                }

            }
        });

    }

    public void createDB(View v) {

    }

}
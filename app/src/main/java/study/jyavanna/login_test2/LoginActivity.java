package study.jyavanna.login_test2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {
    String TAG = "테스트태그";

    SQLiteDatabase db = null;
    Button btnRegist;
    Button btnLogin;

    EditText userNumber;
    EditText userPass;

    DBHelper helper;
    SQLiteDatabase database;

    String sql;
    Cursor cursor;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mAuth = FirebaseAuth.getInstance();

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
                String email = userNumber.getText().toString();
                String password = userPass.getText().toString();
                email = email + "@email.com";
                Log.e(TAG, email);

                mAuth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Sign in success, update UI with the signed-in user's information
                                    Log.d(TAG, "signInWithEmail:success");
                                    FirebaseUser user = mAuth.getCurrentUser();
                                    updateUI(user);
                                    Intent i1;
                                    i1 = new Intent(getApplicationContext(), MainActivity.class);
                                    startActivity(i1);
                                } else {
                                    // If sign in fails, display a message to the user.
                                    Log.w(TAG, "signInWithEmail:failure", task.getException());
                                    Toast.makeText(LoginActivity.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();
                                    updateUI(null);
                                }
                            }
                        });
            }
        });

//        btnLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                String userId = userNumber.getText().toString();
//                String userPassword = userPass.getText().toString();
//
//                if(userId.length() == 0 || userPassword.length() == 0){
//                    Toast.makeText(LoginActivity.this, "아이디와 비밀번호를 입력하세요", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//
//                if(helper != null && helper.checkLogin(userId, userPassword)) {
//                    Intent i1;
//                    i1 = new Intent(getApplicationContext(), MainActivity.class);
//                    startActivity(i1);
//                } else {
//                    Toast.makeText(LoginActivity.this, "잘못된 회원정보입니다.", Toast.LENGTH_SHORT).show();
//                    return;
//                }
//
//            }
//        });

    }

    private void updateUI(FirebaseUser user) {

    }

    public void createDB(View v) {

    }

}
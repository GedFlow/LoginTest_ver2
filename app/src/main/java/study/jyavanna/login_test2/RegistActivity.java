package study.jyavanna.login_test2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
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

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class RegistActivity extends AppCompatActivity {

    String TAG = "테스트태그";
    String FILENAME = "signup.txt";
    EditText name1, phone1, studentnumber1, email1, password1, year1, month1, day1;

    Button btnSignup;
    DBHelper DB;

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);

        mAuth = FirebaseAuth.getInstance();

        name1 = (EditText) findViewById(R.id.name);
        phone1 = (EditText)findViewById(R.id.number);
        studentnumber1 = (EditText)findViewById(R.id.studentnumber);
        email1 = (EditText)findViewById(R.id.email);
        password1 = (EditText)findViewById(R.id.password);
        year1  = (EditText)findViewById(R.id.year);
        month1 = (EditText)findViewById(R.id.month);
        day1 = (EditText)findViewById(R.id.day);

        btnSignup = (Button)findViewById(R.id.sign_up);

        DB = new DBHelper(this);

        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = studentnumber1.getText().toString();
                String password = password1.getText().toString();
                email = email + "@email.com";

                mAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(RegistActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Sign in success, update UI with the signed-in user's information
                                    Log.d(TAG, "createUserWithEmail:success");
                                    FirebaseUser user = mAuth.getCurrentUser();
                                    updateUI(user);
                                } else {
                                    // If sign in fails, display a message to the user.
                                    Log.d(TAG, "createUserWithEmail:failure", task.getException());
                                    Toast.makeText(RegistActivity.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();
                                    updateUI(null);
                                }
                            }
                        });
            }
        });

//        btnSignup.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String userId = studentnumber1.getText().toString();
//                String userPassword = password1.getText().toString();
//
//                if(TextUtils.isEmpty(userId) || TextUtils.isEmpty(userPassword))
//                    Toast.makeText(RegistActivity.this, "빈칸 입력하세요", Toast.LENGTH_SHORT).show();
//                else {
//                    Boolean checkuser = DB.checkUserName(userId);
//                    if(checkuser == false) {
//                        Boolean insert = DB.insertData(userId, userPassword);
//                        if(insert == true) {
//                            Toast.makeText(RegistActivity.this, "회원가입 성공", Toast.LENGTH_SHORT).show();
//                            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
//                            startActivity(intent);
//                        }
//                    }
//                }
//            }
//        });
    }
    private void updateUI(FirebaseUser user) {

    }

    public void onButton1Clicked (View v) {
        AlertDialog.Builder dialog1 = new AlertDialog.Builder(this);       //회원가입 누르면 나오는 AlertDialog 생성
        AlertDialog ad = dialog1.create();         //Dialog에서 취소버튼 누르면 Dilalog만 닫히도록 하기 위해 create() 생성

        dialog1.setTitle("가입정보를 확인하세요!!");

        String name2 = name1.getText().toString();    //Dialog에 editText에서 입력한 값을 받아 오기 위해 String 변수로 전환
        String phone2 = phone1.getText().toString();
        String studentnumber2 = studentnumber1.getText().toString();
        String email2 = email1.getText().toString();
        String year2 = year1.getText().toString();
        String month2 = month1.getText().toString();
        String day2 = day1.getText().toString();

        dialog1.setMessage("이름 : " + name2 + "\n전화번호 : " + phone2 + "\n학번 : " + studentnumber2 + "\n이메일 : " + email2 + "\n생년월일 : " + year2 + "년" + month2 + "월" + day2 + "일");

        dialog1.setNegativeButton("취소", new DialogInterface.OnClickListener() {      //Dialog의 취소버튼
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                Toast.makeText(getApplicationContext(), "회원가입 취소", Toast.LENGTH_SHORT).show();
                ad.dismiss();     //누르면 Dialog만 닫힘
            }
        });

        dialog1.setPositiveButton("회원가입", new DialogInterface.OnClickListener() {     //Dialog의 회원가입 버튼
            @Override
            public void onClick(DialogInterface dialogInterface, int which) {
                Toast.makeText(getApplicationContext(), "환영합니다", Toast.LENGTH_LONG).show();



            }
        });

        dialog1.show();
    }

    public void onButton2Clicked (View v) {          //회원가입 창에서 취소 누르면 모든 editText값 초기화
        name1.setText(null);
        phone1.setText(null);
        studentnumber1.setText(null);
        email1.setText(null);
        password1.setText(null);
        year1.setText(null);
        month1.setText(null);
        day1.setText(null);
    }

    public void onButton3Clicked (View v) {
        Intent i1;
        switch (v.getId()) {
            case R.id.back:
                i1 = new Intent(this, LoginActivity.class);
                startActivity(i1);
                break;
        }
    }
}
package study.jyavanna.login_test2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class RegistActivity extends AppCompatActivity {

    String FILENAME = "signup.txt";
    EditText name1, phone1, studentnumber1, email1, password1, year1, month1, day1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regist);

        name1 = (EditText) findViewById(R.id.name);
        phone1 = (EditText)findViewById(R.id.number);
        studentnumber1 = (EditText)findViewById(R.id.studentnumber);
        email1 = (EditText)findViewById(R.id.email);
        password1 = (EditText)findViewById(R.id.password);
        year1  = (EditText)findViewById(R.id.year);
        month1 = (EditText)findViewById(R.id.month);
        day1 = (EditText)findViewById(R.id.day);

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
                try {          //데이타베이스 입출력(일단 교안에 나온거 그대로 따라함)
                    FileOutputStream fos = openFileOutput(FILENAME, MODE_APPEND);
                    FileInputStream fis = openFileInput(FILENAME);

                    String str = name1.getText().toString() + "," + phone1.getText().toString() + "," + studentnumber1.getText().toString() + "," + email1.getText().toString() + "," + year1.getText().toString() + "," + month1.getText().toString() + "," + day1.getText().toString() + ";";
                    fos.write(str.getBytes());

                    byte[] buffer = new byte[fis.available()];
                    fis.read(buffer);

                    String[] count = (new String(buffer)).split(";");

                    fos.close();
                    fis.close();

                } catch(IOException e) {
                    e.printStackTrace();
                }
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
package study.jyavanna.login_test2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class House extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house);
    }

    public void button1Click(View v) {
        AlertDialog.Builder room1Dialog = new AlertDialog.Builder(this);
        AlertDialog ad = room1Dialog.create();

        room1Dialog.setMessage("위치 : \n" + "년세/월세 : \n" + "보증금 : \n" + "학교까지의 거리 : ");

        room1Dialog.setNeutralButton("뒤로가기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                ad.dismiss();
            }
        });

        room1Dialog.setPositiveButton("더 알아보기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "room1", Toast.LENGTH_SHORT).show();
            }
        });
        room1Dialog.show();
    }

    public void button2Click(View v) {
        AlertDialog.Builder room2Dialog = new AlertDialog.Builder(this);
        AlertDialog ad = room2Dialog.create();

        room2Dialog.setMessage("위치 : \n" + "년세/월세 : \n" + "보증금 : \n" + "학교까지의 거리 : ");

        room2Dialog.setNeutralButton("뒤로가기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                ad.dismiss();
            }
        });

        room2Dialog.setPositiveButton("더 알아보기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "room2", Toast.LENGTH_SHORT).show();
            }
        });
        room2Dialog.show();
    }

    public void button3Click(View v) {
        AlertDialog.Builder room3Dialog = new AlertDialog.Builder(this);
        AlertDialog ad = room3Dialog.create();

        room3Dialog.setMessage("위치 : \n" + "년세/월세 : \n" + "보증금 : \n" + "학교까지의 거리 : ");

        room3Dialog.setNeutralButton("뒤로가기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                ad.dismiss();
            }
        });

        room3Dialog.setPositiveButton("더 알아보기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "room3", Toast.LENGTH_SHORT).show();
            }
        });
        room3Dialog.show();
    }

    public void button4Click(View v) {
        AlertDialog.Builder room4Dialog = new AlertDialog.Builder(this);
        AlertDialog ad = room4Dialog.create();

        room4Dialog.setMessage("위치 : \n" + "년세/월세 : \n" + "보증금 : \n" + "학교까지의 거리 : ");

        room4Dialog.setNeutralButton("뒤로가기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                ad.dismiss();
            }
        });

        room4Dialog.setPositiveButton("더 알아보기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "room4", Toast.LENGTH_SHORT).show();
            }
        });
        room4Dialog.show();
    }


}
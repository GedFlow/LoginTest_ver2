package study.jyavanna.login_test2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
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
        androidx.appcompat.app.AlertDialog.Builder roomDialog = new androidx.appcompat.app.AlertDialog.Builder(this);
        androidx.appcompat.app.AlertDialog.Builder roomDialog_call = new androidx.appcompat.app.AlertDialog.Builder(this);
        androidx.appcompat.app.AlertDialog ad1 = roomDialog.create();
        androidx.appcompat.app.AlertDialog ad2 = roomDialog_call.create();
        roomDialog.setMessage("주소 : 천안시 동남구 안서동 417-8\n년세/월세 : 월세 30만원\n보증금 : 30만원\n관리비 : 5만원\n학교까지의 거리 : 7분(정문)\n연세부동산 전화번호 : 041-561-8949" );
        roomDialog_call.setMessage("연세부동산으로 전화 하시겠습니까? \n" + "tel : 041-561-8949");

        roomDialog.setNeutralButton("뒤로가기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                ad1.dismiss();
            }
        });

        roomDialog.setNegativeButton("전화하기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                roomDialog_call.setNeutralButton("뒤로가기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ad2.dismiss();
                        roomDialog.show();
                    }
                });

                roomDialog_call.setPositiveButton("전화걸기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "연세부동산으로 연락합니다.", Toast.LENGTH_SHORT).show();
                        Intent intent_call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "041-561-8949"));
                        startActivity(intent_call);
                    }
                });
                roomDialog_call.show();
            }
        });

        roomDialog.setPositiveButton("더보기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "직방으로 연결합니다.", Toast.LENGTH_SHORT).show();
                Intent intent_web = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sp.zigbang.com/share/oneroom/31819224?userNo=&stamp=220519034616"));
                startActivity(intent_web);
            }
        });
        roomDialog.show();
    }

    public void button1mapClick(View v) {
        Intent intent_map_web = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/v83joCPTpu7LWMRx9"));
        Toast.makeText(getApplicationContext(), "구글맵으로 연결합니다.", Toast.LENGTH_SHORT).show();
        startActivity(intent_map_web);
    }

    public void button2Click(View v) {
        androidx.appcompat.app.AlertDialog.Builder room2Dialog = new androidx.appcompat.app.AlertDialog.Builder(this);
        androidx.appcompat.app.AlertDialog.Builder room2Dialog_call = new androidx.appcompat.app.AlertDialog.Builder(this);
        androidx.appcompat.app.AlertDialog ad1 = room2Dialog.create();
        androidx.appcompat.app.AlertDialog ad2 = room2Dialog_call.create();
        room2Dialog.setMessage("주소 : 천안시 동남구 안서동 384-1\n년세/월세 : 월세 15만원\n보증금 : 20만원\n관리비 : 7만원\n학교까지의 거리 : 2분(정문)\n금호효자부동산 전화번호 : 041-575-8200" );
        room2Dialog_call.setMessage("금호효자부동산으로 전화 하시겠습니까? \n" + "tel : 041-575-8200");

        room2Dialog.setNeutralButton("뒤로가기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                ad1.dismiss();
            }
        });

        room2Dialog.setNegativeButton("전화하기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                room2Dialog_call.setNeutralButton("뒤로가기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ad2.dismiss();
                        room2Dialog.show();
                    }
                });

                room2Dialog_call.setPositiveButton("전화걸기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "금호효자부동산으로 연락합니다.", Toast.LENGTH_SHORT).show();
                        Intent intent_call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "041-575-8200"));
                        startActivity(intent_call);
                    }
                });
                room2Dialog_call.show();
            }
        });

        room2Dialog.setPositiveButton("더보기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "직방으로 연결합니다.", Toast.LENGTH_SHORT).show();
                Intent intent_web = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sp.zigbang.com/share/oneroom/31643339?userNo=&stamp=220519042116"));
                startActivity(intent_web);
            }
        });
        room2Dialog.show();
    }

    public void button2mapClick(View v) {
        Intent intent_map_web = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/XGmZsaFsZo3vwuce7"));
        Toast.makeText(getApplicationContext(), "구글맵으로 연결합니다.", Toast.LENGTH_SHORT).show();
        startActivity(intent_map_web);
    }

    public void button3Click(View v) {
        androidx.appcompat.app.AlertDialog.Builder room3Dialog = new androidx.appcompat.app.AlertDialog.Builder(this);
        androidx.appcompat.app.AlertDialog.Builder room3Dialog_call = new androidx.appcompat.app.AlertDialog.Builder(this);
        androidx.appcompat.app.AlertDialog ad1 = room3Dialog.create();
        androidx.appcompat.app.AlertDialog ad2 = room3Dialog_call.create();
        room3Dialog.setMessage("주소 : 천안시 동남구 안서동 379-31\n년세/월세 : 월세 25만원\n보증금 : 30만원\n관리비 : 5만원\n학교까지의 거리 : 6분(정문)\n연세부동산 전화번호 : 041-561-8949" );
        room3Dialog_call.setMessage("연세부동산으로 전화 하시겠습니까? \n" + "tel : 041-561-8949");

        room3Dialog.setNeutralButton("뒤로가기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                ad1.dismiss();
            }
        });

        room3Dialog.setNegativeButton("전화하기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                room3Dialog_call.setNeutralButton("뒤로가기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ad2.dismiss();
                        room3Dialog.show();
                    }
                });

                room3Dialog_call.setPositiveButton("전화걸기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "연세부동산으로 연락합니다.", Toast.LENGTH_SHORT).show();
                        Intent intent_call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "041-561-8949"));
                        startActivity(intent_call);
                    }
                });
                room3Dialog_call.show();
            }
        });

        room3Dialog.setPositiveButton("더보기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "직방으로 연결합니다.", Toast.LENGTH_SHORT).show();
                Intent intent_web = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sp.zigbang.com/share/oneroom/31627044?userNo=&stamp=220519042920"));
                startActivity(intent_web);
            }
        });
        room3Dialog.show();
    }

    public void button3mapClick(View v) {
        Intent intent_map_web = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/4s68oGmhwYNhP6vW6"));
        Toast.makeText(getApplicationContext(), "구글맵으로 연결합니다.", Toast.LENGTH_SHORT).show();
        startActivity(intent_map_web);
    }

    public void button4Click(View v) {
        androidx.appcompat.app.AlertDialog.Builder room4Dialog = new androidx.appcompat.app.AlertDialog.Builder(this);
        androidx.appcompat.app.AlertDialog.Builder room4Dialog_call = new androidx.appcompat.app.AlertDialog.Builder(this);
        androidx.appcompat.app.AlertDialog ad1 = room4Dialog.create();
        androidx.appcompat.app.AlertDialog ad2 = room4Dialog_call.create();
        room4Dialog.setMessage("주소 : 천안시 동남구 안서동 418-2\n년세/월세 : 월세 25만원\n보증금 : 20만원\n관리비 : 5만원\n학교까지의 거리 : 7분(정문)\n연세부동산 전화번호 : 041-561-8949" );
        room4Dialog_call.setMessage("연세부동산으로 전화 하시겠습니까? \n" + "tel : 041-561-8949");

        room4Dialog.setNeutralButton("뒤로가기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                ad1.dismiss();
            }
        });

        room4Dialog.setNegativeButton("전화하기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                room4Dialog_call.setNeutralButton("뒤로가기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ad2.dismiss();
                        room4Dialog.show();
                    }
                });

                room4Dialog_call.setPositiveButton("전화걸기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "연세부동산으로 연락합니다.", Toast.LENGTH_SHORT).show();
                        Intent intent_call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "041-561-8949"));
                        startActivity(intent_call);
                    }
                });
                room4Dialog_call.show();
            }
        });

        room4Dialog.setPositiveButton("더보기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "직방으로 연결합니다.", Toast.LENGTH_SHORT).show();
                Intent intent_web = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sp.zigbang.com/share/oneroom/31490126?userNo=&stamp=220519043437"));
                startActivity(intent_web);
            }
        });
        room4Dialog.show();
    }

    public void button4mapClick(View v) {
        Intent intent_map_web = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/pewWq47Maypc5Aec6"));
        Toast.makeText(getApplicationContext(), "구글맵으로 연결합니다.", Toast.LENGTH_SHORT).show();
        startActivity(intent_map_web);
    }

    public void button5Click(View v) {
        androidx.appcompat.app.AlertDialog.Builder room5Dialog = new androidx.appcompat.app.AlertDialog.Builder(this);
        androidx.appcompat.app.AlertDialog.Builder room5Dialog_call = new androidx.appcompat.app.AlertDialog.Builder(this);
        androidx.appcompat.app.AlertDialog ad1 = room5Dialog.create();
        androidx.appcompat.app.AlertDialog ad2 = room5Dialog_call.create();
        room5Dialog.setMessage("주소 : 천안시 동남구 안서동 107-13\n년세/월세 : 년세 420만원\n보증금 : 50원\n관리비 : 0만원\n학교까지의 거리 : 1분(쪽문)\n금호114부동산 전화번호 : 041-552-5114" );
        room5Dialog_call.setMessage("금호114부동산으로 전화 하시겠습니까? \n" + "tel : 041-552-5114");

        room5Dialog.setNeutralButton("뒤로가기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                ad1.dismiss();
            }
        });

        room5Dialog.setNegativeButton("전화하기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                room5Dialog_call.setNeutralButton("뒤로가기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ad2.dismiss();
                        room5Dialog.show();
                    }
                });

                room5Dialog_call.setPositiveButton("전화걸기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "금호114부동산으로 연락합니다.", Toast.LENGTH_SHORT).show();
                        Intent intent_call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "041-552-5114"));
                        startActivity(intent_call);
                    }
                });
                room5Dialog_call.show();
            }
        });

        room5Dialog.setPositiveButton("더보기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "네이버로 연결합니다.", Toast.LENGTH_SHORT).show();
                Intent intent_web = new Intent(Intent.ACTION_VIEW, Uri.parse("https://new.land.naver.com/rooms?ms=36.8394745,127.1895096,15&a=APT:OPST:ABYG:OBYG:GM:OR:VL:DDDGG:JWJT:SGJT:HOJT&e=RETAIL&aa=SMALLSPCRENT&articleNo=2214719768"));
                startActivity(intent_web);
            }
        });
        room5Dialog.show();
    }

    public void button5mapClick(View v) {
        Intent intent_map_web = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/jhRnA9ZsCpvbCnkN9"));
        Toast.makeText(getApplicationContext(), "구글맵으로 연결합니다.", Toast.LENGTH_SHORT).show();
        startActivity(intent_map_web);
    }

    public void button6Click(View v) {
        androidx.appcompat.app.AlertDialog.Builder room6Dialog = new androidx.appcompat.app.AlertDialog.Builder(this);
        androidx.appcompat.app.AlertDialog.Builder room6Dialog_call = new androidx.appcompat.app.AlertDialog.Builder(this);
        androidx.appcompat.app.AlertDialog ad1 = room6Dialog.create();
        androidx.appcompat.app.AlertDialog ad2 = room6Dialog_call.create();
        room6Dialog.setMessage("주소 : 천안시 동남구 안서동 417-7\n년세/월세 : 월세 25만원\n보증금 : 20만원\n관리비 : 5만원\n학교까지의 거리 : 7분(정문)\n연세부동산 전화번호 : 041-561-8949" );
        room6Dialog_call.setMessage("연세부동산으로 전화 하시겠습니까? \n" + "tel : 041-561-8949");

        room6Dialog.setNeutralButton("뒤로가기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                ad1.dismiss();
            }
        });

        room6Dialog.setNegativeButton("전화하기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                room6Dialog_call.setNeutralButton("뒤로가기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ad2.dismiss();
                        room6Dialog.show();
                    }
                });

                room6Dialog_call.setPositiveButton("전화걸기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "연세부동산으로 연락합니다.", Toast.LENGTH_SHORT).show();
                        Intent intent_call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "041-561-8949"));
                        startActivity(intent_call);
                    }
                });
                room6Dialog_call.show();
            }
        });

        room6Dialog.setPositiveButton("더보기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "네이버로 연결합니다.", Toast.LENGTH_SHORT).show();
                Intent intent_web = new Intent(Intent.ACTION_VIEW, Uri.parse("https://new.land.naver.com/rooms?ms=36.8415524,127.1939084,16&a=APT:OPST:ABYG:OBYG:GM:OR:VL:DDDGG:JWJT:SGJT:HOJT&e=RETAIL&aa=SMALLSPCRENT&articleNo=2215736357"));
                startActivity(intent_web);
            }
        });
        room6Dialog.show();
    }

    public void button6mapClick(View v) {
        Intent intent_map_web = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/vc5Yji3NW1xMnwcZA"));
        Toast.makeText(getApplicationContext(), "구글맵으로 연결합니다.", Toast.LENGTH_SHORT).show();
        startActivity(intent_map_web);
    }

    public void button7Click(View v) {
        androidx.appcompat.app.AlertDialog.Builder room7Dialog = new androidx.appcompat.app.AlertDialog.Builder(this);
        androidx.appcompat.app.AlertDialog.Builder room7Dialog_call = new androidx.appcompat.app.AlertDialog.Builder(this);
        androidx.appcompat.app.AlertDialog ad1 = room7Dialog.create();
        androidx.appcompat.app.AlertDialog ad2 = room7Dialog_call.create();
        room7Dialog.setMessage("주소 : 천안시 동남구 안서동 83-6\n년세/월세 : 월세 33만원\n보증금 : 50만원\n관리비 : 5만원\n학교까지의 거리 : 17분(정문)\n연세부동산 전화번호 : 041-561-8949" );
        room7Dialog_call.setMessage("연세부동산으로 전화 하시겠습니까? \n" + "tel : 041-561-8949");

        room7Dialog.setNeutralButton("뒤로가기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                ad1.dismiss();
            }
        });

        room7Dialog.setNegativeButton("전화하기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                room7Dialog_call.setNeutralButton("뒤로가기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ad2.dismiss();
                        room7Dialog.show();
                    }
                });

                room7Dialog_call.setPositiveButton("전화걸기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "연세부동산으로 연락합니다.", Toast.LENGTH_SHORT).show();
                        Intent intent_call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "041-561-8949"));
                        startActivity(intent_call);
                    }
                });
                room7Dialog_call.show();
            }
        });

        room7Dialog.setPositiveButton("더보기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "네이버로 연결합니다.", Toast.LENGTH_SHORT).show();
                Intent intent_web = new Intent(Intent.ACTION_VIEW, Uri.parse("https://new.land.naver.com/rooms?ms=36.8415524,127.1939084,16&a=APT:OPST:ABYG:OBYG:GM:OR:VL:DDDGG:JWJT:SGJT:HOJT&e=RETAIL&aa=SMALLSPCRENT&articleNo=2212764031"));
                startActivity(intent_web);
            }
        });
        room7Dialog.show();
    }

    public void button7mapClick(View v) {
        Intent intent_map_web = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/ak4KNQBH6avcxsTQ9"));
        Toast.makeText(getApplicationContext(), "구글맵으로 연결합니다.", Toast.LENGTH_SHORT).show();
        startActivity(intent_map_web);
    }

    public void button8Click(View v) {
        androidx.appcompat.app.AlertDialog.Builder room8Dialog = new androidx.appcompat.app.AlertDialog.Builder(this);
        androidx.appcompat.app.AlertDialog.Builder room8Dialog_call = new androidx.appcompat.app.AlertDialog.Builder(this);
        androidx.appcompat.app.AlertDialog ad1 = room8Dialog.create();
        androidx.appcompat.app.AlertDialog ad2 = room8Dialog_call.create();
        room8Dialog.setMessage("주소 : 천안시 동남구 안서동 337-2\n년세/월세 : 월세 45만원\n보증금 : 500만원\n관리비 : 7만원\n학교까지의 거리 : 9분(정문)\n금호114부동산 전화번호 : 041-552-5114" );
        room8Dialog_call.setMessage("금호114부동산으로 전화 하시겠습니까? \n" + "tel : 041-552-5114");

        room8Dialog.setNeutralButton("뒤로가기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                ad1.dismiss();
            }
        });

        room8Dialog.setNegativeButton("전화하기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                room8Dialog_call.setNeutralButton("뒤로가기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ad2.dismiss();
                        room8Dialog.show();
                    }
                });

                room8Dialog_call.setPositiveButton("전화걸기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "금호114부동산으로 연락합니다.", Toast.LENGTH_SHORT).show();
                        Intent intent_call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "041-552-5114"));
                        startActivity(intent_call);
                    }
                });
                room8Dialog_call.show();
            }
        });

        room8Dialog.setPositiveButton("더보기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "네이버로 연결합니다.", Toast.LENGTH_SHORT).show();
                Intent intent_web = new Intent(Intent.ACTION_VIEW, Uri.parse("https://new.land.naver.com/rooms?ms=36.831084,127.1884078,15&a=APT:OPST:ABYG:OBYG:GM:OR:VL:DDDGG:JWJT:SGJT:HOJT&e=RETAIL&aa=SMALLSPCRENT&articleNo=2215418675"));
                startActivity(intent_web);
            }
        });
        room8Dialog.show();
    }

    public void button8mapClick(View v) {
        Intent intent_map_web = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/ATAYt9XpsdHdYFsF9"));
        Toast.makeText(getApplicationContext(), "구글맵으로 연결합니다.", Toast.LENGTH_SHORT).show();
        startActivity(intent_map_web);
    }

    public void button9Click(View v) {
        androidx.appcompat.app.AlertDialog.Builder room9Dialog = new androidx.appcompat.app.AlertDialog.Builder(this);
        androidx.appcompat.app.AlertDialog.Builder room9Dialog_call = new androidx.appcompat.app.AlertDialog.Builder(this);
        androidx.appcompat.app.AlertDialog ad1 = room9Dialog.create();
        AlertDialog ad2 = room9Dialog_call.create();
        room9Dialog.setMessage("주소 : 천안시 동남구 문암4길 28-1\n년세/월세 : 년세 300만원\n보증금 : 0원\n관리비 : 0원\n학교까지의 거리 : 3분(백문대정문)\n담당자 전화번호 : 010-3425-4008" );
        room9Dialog_call.setMessage("담당자에게 전화 하시겠습니까? \n" + "tel : 010-3425-4008");

        room9Dialog.setNeutralButton("뒤로가기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                ad1.dismiss();
            }
        });

        room9Dialog.setNegativeButton("전화하기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                room9Dialog_call.setNeutralButton("뒤로가기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ad2.dismiss();
                        room9Dialog.show();
                    }
                });

                room9Dialog_call.setPositiveButton("전화걸기", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "담당연락처로 연락합니다.", Toast.LENGTH_SHORT).show();
                        Intent intent_call = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "010-3425-4008"));
                        startActivity(intent_call);
                    }
                });
                room9Dialog_call.show();
            }
        });

        room9Dialog.setPositiveButton("더보기", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(), "사이트로 연결합니다.", Toast.LENGTH_SHORT).show();
                Intent intent_web = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.parkvil.co.kr/"));
                startActivity(intent_web);
            }
        });
        room9Dialog.show();
    }

    public void button9mapClick(View v) {
        Intent intent_map_web = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/maps/ba5LVKbLRJNk8ApB7"));
        Toast.makeText(getApplicationContext(), "구글맵으로 연결합니다.", Toast.LENGTH_SHORT).show();
        startActivity(intent_map_web);
    }


}
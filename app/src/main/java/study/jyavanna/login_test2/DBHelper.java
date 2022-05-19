package study.jyavanna.login_test2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DBNAME="login.db";
    public DBHelper(Context context) {
        super(context, "login.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("create table users(username TEXT primary key, password TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("drop table if exists users");
    }

    public Boolean insertData(String username, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("username", username);
        values.put("password", password);

        long result = db.insert("users", null, values);
        if(result == -1)
            return false;
        else
            return true;

    }

    public Boolean checkUserName(String username) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from users where username=?", new String[] {username});
        if(cursor.getCount() > 0)
            return true;
        else
            return false;
    }

    public Boolean checkUserPassword(String username, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from users where username=? and password=?", new String[] {username, password});
        if(cursor.getCount()>0)
            return true;
        else
            return false;
    }

    public boolean checkLogin(String username, String password) {
        SQLiteDatabase db = this.getReadableDatabase();
        String sql = "select * from users where username=? and password=?";
        Cursor cursor = db.rawQuery(sql, new String[]{username, password});
        Log.e("로그", username);
        Log.e("로그", password);
        if (cursor.moveToFirst() == true) {
            cursor.close();
            return true;
        }
        return false;
    }

}

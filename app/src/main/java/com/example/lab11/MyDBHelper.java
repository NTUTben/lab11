package com.example.lab11;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDBHelper extends SQLiteOpenHelper {
    private static final String name = "mdatabase.db"; // 資料庫名稱
    private static final int version = 1; // 資料庫版本

    // 建構子
    public MyDBHelper(Context context) {
        super(context, name, null, version);
    }

    // 建立資料表
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE myTable(book TEXT PRIMARY KEY, price INTEGER NOT NULL)");
    }

    // 升級資料庫
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS myTable");
        onCreate(db);
    }
}

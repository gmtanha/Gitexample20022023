package com.example.baitapsqlcrud

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MyHelper(context: Context):SQLiteOpenHelper(context,"TUHOCDB",null,1) {
    override fun onCreate(p0: SQLiteDatabase?) {
        p0?.execSQL("CREATE TABLE TUHOC(_id INTEGER PRIMARY KEY AUTOINCREMENT,user TEXT,email TEXT)")
        p0?.execSQL("INSERT INTO TUHOC (user,email) VALUES ('mot','mot@gmail.com')")
        p0?.execSQL("INSERT INTO TUHOC (user,email) VALUES ('hai','hai@gmail.com')")
        p0?.execSQL("INSERT INTO TUHOC (user,email) VALUES ('ba','ba@gmail.com')")
        p0?.execSQL("INSERT INTO TUHOC (user,email) VALUES ('bon','bon@gmail.com')")
        p0?.execSQL("INSERT INTO TUHOC (user,email) VALUES ('tuhoc.cc','tuhoc.cc@gmail.com')")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }
}
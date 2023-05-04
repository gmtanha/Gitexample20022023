package com.example.sqlite_mydbhelper

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MyDbHelper(context:Context):SQLiteOpenHelper(context,"USERDB",null,1) {
    override fun onCreate(p0: SQLiteDatabase?) {
        p0?.execSQL("CREATE TABLE USERS(USERID INTEGER PRIMARY KEY AUTOINCREMENT,UNAME TEXT,PWD TEXT)")
        p0?.execSQL("INSERT INTO USERS (UNAME,USERID) VALUES ('teo@gmail.com','11111')")
        p0?.execSQL("INSERT INTO USERS (UNAME,USERID) VALUES ('ti@gmail.com','22222')")
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }
}
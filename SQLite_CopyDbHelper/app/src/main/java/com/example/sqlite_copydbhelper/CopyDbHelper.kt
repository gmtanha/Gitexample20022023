package com.example.sqlite_copydbhelper

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import java.io.File
import java.io.FileOutputStream

class CopyDbHelper(private val context: Context) {
    companion object{
        private val DB_NAME = "TUHOCDB.db"
    }
    fun openDatabase():SQLiteDatabase{
        val dbFile = context.getDatabasePath(DB_NAME)
        val file = File(dbFile.toString())
        if (file.exists()){
            Log.e("tuhoc","file đã tồn tại")
        }else{
            copyDatabase(dbFile)
        }
        return SQLiteDatabase.openDatabase(dbFile.path,null,SQLiteDatabase.OPEN_READWRITE)
    }

    private fun copyDatabase(dbFile: File?) {
        val openDb = context.assets.open(DB_NAME)
        val outputStream = FileOutputStream(dbFile)
        val buffer = ByteArray(1024)
        while (openDb.read(buffer)>0){
            outputStream.write(buffer)
            Log.wtf("DB","Wring")
        }
        outputStream.flush()
        outputStream.close()
        openDb.close()
        Log.wtf("DB","Copy DB complete")
    }
}
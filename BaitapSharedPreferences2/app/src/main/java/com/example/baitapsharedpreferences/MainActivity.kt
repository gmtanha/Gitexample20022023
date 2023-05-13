package com.example.baitapsharedpreferences

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var edtSend: EditText
    private lateinit var edtMessage: EditText
    private lateinit var btnDem: Button
    private lateinit var cbRemember: CheckBox

    var dem = 0
    var send:String?=null
    var message: String? = null
    var isChecked:Boolean? = null
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        edtSend = findViewById(R.id.edtSend)
        edtMessage = findViewById(R.id.edtMessage)
        btnDem = findViewById(R.id.btnDem)
        cbRemember = findViewById(R.id.cbRemember)

        btnDem.setOnClickListener {
            dem++
            btnDem.text = dem.toString()
        }
    }

    override fun onPause() {
        super.onPause()
        saveData()
    }

    private fun saveData() {
        sharedPreferences = this.getSharedPreferences("saveData",Context.MODE_PRIVATE)
        send = edtSend.text.toString()
        message = edtMessage.text.toString()
        isChecked = cbRemember.isChecked
        val editor = sharedPreferences.edit()
        editor.putString("key_send",send)
        editor.putString("key_mes",message)
        editor.putInt("key_dem",dem)
        editor.putBoolean("key_remember",isChecked!!)
        editor.apply()
        Toast.makeText(applicationContext,"Data đã lưu",Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        trieuHoiData()
    }

    private fun trieuHoiData() {
        sharedPreferences = this.getSharedPreferences("saveData",Context.MODE_PRIVATE)
        send = sharedPreferences.getString("key_send",null)
        message = sharedPreferences.getString("key_mes",null)
        dem = sharedPreferences.getInt("key_dem",0)
        isChecked = sharedPreferences.getBoolean("key_remember",false)
        edtSend.setText(send)
        edtMessage.setText(message)
        btnDem.text = dem.toString()
        cbRemember.isChecked = isChecked!!
    }
}
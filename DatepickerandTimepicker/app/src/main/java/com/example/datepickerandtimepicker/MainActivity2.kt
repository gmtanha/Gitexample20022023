package com.example.datepickerandtimepicker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
    private lateinit var btnQuayLai: Button
    private lateinit var btnGetIntent: Button
    private lateinit var btnBundle: Button
    private lateinit var edtGetIntent: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btnQuayLai = findViewById(R.id.btnQuayLai)
        btnGetIntent = findViewById(R.id.btnGetIntent)
        edtGetIntent = findViewById(R.id.edtGetIntent)

        btnQuayLai.setOnClickListener {
            val i2 = Intent(this@MainActivity2,MainActivity::class.java)
            startActivity(i2)
        }

        btnGetIntent.setOnClickListener {
            val i = intent
            val bundle = i.extras
            if (bundle!=null){
                val bienString = bundle.getString("bienString")
                val  bienDouble = bundle.getDouble("bienDouble")
                val bienBoolean = bundle.getBoolean("bienBoolean",false)
                val bienInt = bundle.getInt("bienInt")
                edtGetIntent.setText(bienString+"\n" + bienDouble+"\n"+ bienInt+"\n" + bienBoolean)
            }
        }
    }
}
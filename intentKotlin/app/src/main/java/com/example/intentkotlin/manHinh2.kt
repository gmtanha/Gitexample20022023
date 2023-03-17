package com.example.intentkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.intentkotlin.databinding.ActivityMainBinding

class manHinh2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_man_hinh2)
        val btnQuayLai = findViewById<Button>(R.id.btnQuayLai)
        val edtGetIntent = findViewById<EditText>(R.id.edtGetIntent)
        val i = intent
//        val bienStrings = i.getStringExtra("bienString")
//        val bienDouble = i.getDoubleExtra("bienDouble",0.0)
//        val bienBool = i.getBooleanExtra("bienBool",false)
//        edtGetIntent.setText(bienStrings + "\n" +bienDouble + "\n" +bienBool)
        val bundle = i.extras
        if (bundle !=null){
            val bienStrings = bundle.getString("bienString")
            val bienDouble = bundle.getDouble("bienDouble")
            val bienBool = bundle.getBoolean("bienBool")
            val bienInt = bundle.getInt("bienInt")
            edtGetIntent.setText(bienStrings + "\n" +bienDouble +"\n" +bienBool +"\n" +bienInt)
        }
        btnQuayLai.setOnClickListener {
            val i3 = Intent(this,MainActivity::class.java)
            startActivity(i3)
        }

    }
}
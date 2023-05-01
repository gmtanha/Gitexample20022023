package com.example.intentsingertop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    private lateinit var btnMain2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        btnMain2 = findViewById(R.id.btnMain2)
        btnMain2.setOnClickListener {
            val i2 = Intent(this@MainActivity2,MainActivity3::class.java)
            startActivity(i2)
        }
        Log.d("BBB", "Mani2: onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d("BBB", "Mani2:onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("BBB", "Mani2:onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("BBB", "Mani2:onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("BBB", "Mani2:onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("BBB", "Mani2:onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("BBB", "Mani2:onRestart")
    }

}
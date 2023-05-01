package com.example.intentsingertop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    private lateinit var btnMain3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        btnMain3 = findViewById(R.id.btnMain3)
        btnMain3.setOnClickListener {
            val i3 = Intent(this@MainActivity3,MainActivity::class.java)
            startActivity(i3)
        }
        Log.d("BBB", "Mani3: onCreate")
    }
    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d("BBB", "onNewIntent")
    }

    override fun onStart() {
        super.onStart()
        Log.d("BBB", "Mani3:onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("BBB", "Mani3:onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("BBB", "Mani3:onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("BBB", "Mani3:onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("BBB", "Mani3:onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("BBB", "Mani3:onRestart")
    }
}
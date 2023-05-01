package com.example.activitylifecyle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    private lateinit var btnUpdateScreen3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("BBB", "Main3: onCreate")
        setContentView(R.layout.activity_main3)
        btnUpdateScreen3 = findViewById(R.id.button_update_screen_3)

        btnUpdateScreen3.setOnClickListener {
            val intent = Intent(this@MainActivity3, MainActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.d("BBB", "onNewIntent")
    }

    override fun onStart() {
        super.onStart()
        Log.d("BBB", "Main3: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("BBB", "Main3: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("BBB", "Main3: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("BBB", "Main3: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("BBB", "Main3: onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("BBB", "Main3: onRestart")
    }

}
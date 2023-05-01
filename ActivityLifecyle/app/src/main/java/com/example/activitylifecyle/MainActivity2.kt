package com.example.activitylifecyle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    private lateinit var btnNavigateScreen3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.d("BBB", "Main2: onCreate")

        btnNavigateScreen3 = findViewById(R.id.button_navigate_screen_3)
        btnNavigateScreen3.setOnClickListener {
            val intent = Intent(this@MainActivity2, MainActivity3::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("BBB", "Main2: onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("BBB", "Main2: onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("BBB", "Main2: onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("BBB", "Main2: onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("BBB", "Main2: onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("BBB", "Main2: onRestart")
    }



}
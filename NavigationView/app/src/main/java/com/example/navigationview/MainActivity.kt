package com.example.navigationview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.navigation.NavigationBarItemView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var nav_leftmenu: NavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nav_leftmenu = findViewById(R.id.nav_leftmenu)
        nav_leftmenu.itemIconTintList = null
        nav_leftmenu.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.menuHome -> Toast.makeText(this,"Home",Toast.LENGTH_SHORT).show()
                R.id.menuMessage -> Toast.makeText(this,"Message",Toast.LENGTH_SHORT).show()
                R.id.menuExit -> finish()
            }
            true
        }
    }
}
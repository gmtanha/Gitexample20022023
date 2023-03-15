package com.example.intentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentkotlin.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding
class manhinh21 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
package com.example.chonhinh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.chonhinh.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       addEvent()
    }

    private fun addEvent() {
        binding.rdPic1.setOnCheckedChangeListener { compoundButton, isChecked ->
            binding.imgHinh.setImageResource(R.drawable.pic1)
        }
        binding.rdPic2.setOnCheckedChangeListener { compoundButton, isChecked ->
            binding.imgHinh.setImageResource(R.drawable.pic2)
        }
        binding.btnThoat.setOnClickListener {
            finish()
            Toast.makeText(this,"Cảm ơn bạn đã sử dụng phần mềm",Toast.LENGTH_SHORT).show()
        }
    }
}
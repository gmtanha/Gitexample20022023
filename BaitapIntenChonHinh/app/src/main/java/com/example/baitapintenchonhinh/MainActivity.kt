package com.example.baitapintenchonhinh

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var tvScore: TextView
    private lateinit var imgRandom: ImageView
    private lateinit var imgPick: ImageView
    private lateinit var arrAnimal: List<String>
    private var resourceRandom = -1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvScore = findViewById(R.id.tvScore)
        imgRandom = findViewById(R.id.imgRandom)
        imgPick = findViewById(R.id.imgPick)

        randomImage()


        imgPick.setOnClickListener {
            val intent = Intent(this,ListAnimal::class.java)
            resultlauncher.launch(intent)
        }
    }
    private val resultlauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){result ->
        if (result.resultCode == Activity.RESULT_OK){
            val resourcePick = result.data?.getIntExtra("resource",-1)
            if (resourcePick == null || resourcePick == -1)return@registerForActivityResult
                imgPick.setImageResource(resourcePick)
            if (resourcePick == resourceRandom){
                Toast.makeText(this,"Chính xác",Toast.LENGTH_SHORT).show()
                randomImage()
            }else{
                Toast.makeText(this,"Bạn chọn sai",Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_random,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu_Refesh -> randomImage()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun randomImage() {
        arrAnimal = resources.getStringArray(R.array.arrAnimal).toList()
        val indexRandom = Random.nextInt(arrAnimal.size)
        val nameAnimal = arrAnimal[indexRandom]
        resourceRandom = resources.getIdentifier(nameAnimal,"drawable",packageName)
        imgRandom.setImageResource(resourceRandom)
    }
}
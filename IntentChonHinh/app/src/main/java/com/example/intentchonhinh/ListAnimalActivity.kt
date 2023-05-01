package com.example.intentchonhinh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.Toast
import kotlin.math.ceil

class ListAnimalActivity : AppCompatActivity() {
    private lateinit var tableLayout: TableLayout
    private lateinit var arrNameAnimal: List<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_animal)
        tableLayout = findViewById(R.id.table_layout)

        arrNameAnimal = resources.getStringArray(R.array.arrNameAnimal).toList().shuffled()
        val totalColum = 3
        val totalRow = 6
        for (row in 0 until totalRow ){
            val tableRow = TableRow(this)
            val tableLayoutParams = FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT)
            tableLayoutParams.marginStart = 15
            tableRow.layoutParams = tableLayoutParams
            for (colum in 0 until totalColum){
                val image = ImageView(this)
                val index = ((totalColum * row) + colum)
                val layoutParams: TableRow.LayoutParams = TableRow.LayoutParams(350,350)
                image.layoutParams = layoutParams
                val nameAnimal = arrNameAnimal[index]
                val resourcePick = resources.getIdentifier(nameAnimal,"drawable",packageName)
                image.setImageResource(resourcePick)
                image.setOnClickListener {
                    val intent = Intent(this@ListAnimalActivity,MainActivity::class.java)
                    val resource = resources.getIdentifier(arrNameAnimal[index],"drawable",packageName)
                    intent.putExtra("resource",resource)
                    setResult(RESULT_OK,intent)
                    finish()
                }
                tableRow.addView(image)
            }
            tableLayout.addView(tableRow)
        }
    }
}
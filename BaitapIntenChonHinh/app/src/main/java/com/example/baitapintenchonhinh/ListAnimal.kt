package com.example.baitapintenchonhinh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TableLayout
import android.widget.TableRow

class ListAnimal : AppCompatActivity() {
    private lateinit var tableLayout: TableLayout
    private lateinit var arrAnimal: List<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_animal)
        tableLayout = findViewById(R.id.tabLayout)
        arrAnimal = resources.getStringArray(R.array.arrAnimal).toList()
        val totalColum = 3
        val totalRow = 6
        for (row in 0 until totalRow){
            val tableRow = TableRow(this)
            val tablelayoutParams = FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT)
            tablelayoutParams.marginStart = 15
            tableRow.layoutParams = tablelayoutParams
            for (colum in 0 until totalColum){
                val index = ((totalColum*row)+colum)
                val image = ImageView(this)
                val layoutParams: TableLayout.LayoutParams = TableLayout.LayoutParams(350,350)
                tableRow.layoutParams = layoutParams
                val imageAnimal = arrAnimal[index]
                val imageResource = resources.getIdentifier(imageAnimal,"drawable",packageName)
                image.setImageResource(imageResource)
                image.setOnClickListener {
                    val intent = Intent(this@ListAnimal,MainActivity::class.java)
                    val imagePick = arrAnimal[index]
                    val resource = resources.getIdentifier(imagePick,"drawable",packageName)
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
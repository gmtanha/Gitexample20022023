package com.example.listviewnangcao

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(val activity: Activity, val list: List<OutData>): ArrayAdapter<OutData>(activity,R.layout.list_item){
    override fun getCount(): Int {
        return list.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val contexs = activity.layoutInflater
        val rowView = contexs.inflate(R.layout.list_item,parent,false)
        val image = rowView.findViewById<ImageView>(R.id.imgTraiCay)
        val txtTen = rowView.findViewById<TextView>(R.id.txtTen)
        val txtDesc = rowView.findViewById<TextView>(R.id.txtDesc)
        txtTen.text = list[position].title
        txtDesc.text = list[position].desc
        image.setImageResource(list[position].image)
        return rowView
    }
}
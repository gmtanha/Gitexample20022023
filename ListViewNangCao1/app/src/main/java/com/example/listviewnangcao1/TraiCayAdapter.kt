package com.example.listviewnangcao1

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class TraiCayAdapter(val activity: Activity,val list: List<OutData>):ArrayAdapter<OutData>(activity,R.layout.layout_item) {
    override fun getCount(): Int {
        return list.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val context = activity.layoutInflater
        val rowView = context.inflate(R.layout.layout_item,parent,false)
        val images = rowView.findViewById<ImageView>(R.id.imgTraiCay)
        val title = rowView.findViewById<TextView>(R.id.tvTen)
        val desc = rowView.findViewById<TextView>(R.id.tvMoTa)
        title.text = list[position].title
        desc.text = list[position].desc
        images.setImageResource(list[position].image)
        return rowView
    }
}
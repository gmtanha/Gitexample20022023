package com.example.spinnernangcao

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class SpinerAdapter(val activity: Activity,val list: List<OutData>):ArrayAdapter<OutData>(activity,R.layout.list_monan) {
    override fun getCount(): Int {
        return list.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return initView(position, convertView, parent)
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        return initView(position, convertView, parent)
    }
    private fun initView(position: Int, convertView: View?, parent: ViewGroup): View{
        val context = activity.layoutInflater
        val rowView = context.inflate(R.layout.list_monan,parent,false)
        val images= rowView.findViewById<ImageView>(R.id.imgMonAn)
        val desc = rowView.findViewById<TextView>(R.id.txtMonAn)
        desc.text = list[position].desc
        images.setImageResource(list[position].image)
        return rowView
    }
}

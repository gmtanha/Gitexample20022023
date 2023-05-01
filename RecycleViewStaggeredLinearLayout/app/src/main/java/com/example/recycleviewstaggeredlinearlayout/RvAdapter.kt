package com.example.recycleviewstaggeredlinearlayout

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class RvAdapter(val list: List<Int>):RecyclerView.Adapter<RvAdapter.HinhViewHolder>() {
    inner class HinhViewHolder(itemView:View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HinhViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_item,parent,false)
        return HinhViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: HinhViewHolder, position: Int) {
        holder.itemView.apply {
            val imgHinh = findViewById<ImageView>(R.id.imgHinh)
            imgHinh.setImageResource(list[position])
        }
    }
}
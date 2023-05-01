package com.example.recyclerviewstagger

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class RvAdapter(val ds:List<Int>, val OnTraiCayClik:RvInterface):RecyclerView.Adapter<RvAdapter.ItemViewHolder>() {
    class ItemViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_item,parent,false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.itemView.apply {
            val imgAnh = findViewById<ImageView>(R.id.imgAnh)
            imgAnh.setImageResource(ds[position])
            holder.itemView.setOnClickListener {
                OnTraiCayClik.OnClickTraiCay(position)
            }
        }
    }

    override fun getItemCount(): Int {
        return ds.size
    }
}
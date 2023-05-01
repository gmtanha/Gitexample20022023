package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RvAdapter(var ds:List<OutData>,val onPhimClick:RvInterface):RecyclerView.Adapter<RvAdapter.TraiCayViewHold>() {
    inner class TraiCayViewHold(itemView:View):RecyclerView.ViewHolder(itemView)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TraiCayViewHold {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_item,parent,false)
        return TraiCayViewHold(view)
    }

    override fun onBindViewHolder(holder: TraiCayViewHold, position: Int) {
        holder.itemView.apply {
            val tvTraiCay = findViewById<TextView>(R.id.tvTraiCay)
            val tvMieuTa = findViewById<TextView>(R.id.tvMieuTa)
            val imgTraiCay = findViewById<ImageView>(R.id.imgTraiCay)
            tvTraiCay.text = ds[position].tentraicay
            tvMieuTa.text = ds[position].mieuta
            imgTraiCay.setImageResource(ds[position].image)

            holder.itemView.setOnClickListener {
                onPhimClick.onClickPhim(position)
            }
        }
    }

    override fun getItemCount(): Int {
        return ds.size
    }
}
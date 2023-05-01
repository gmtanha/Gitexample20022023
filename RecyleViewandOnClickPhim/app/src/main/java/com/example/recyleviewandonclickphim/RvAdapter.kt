package com.example.recyleviewandonclickphim

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RvAdapter(val list: List<OutData>,val OnPhimClick:RvInterface):RecyclerView.Adapter<RvAdapter.PhimViewHolder>() {
    inner class PhimViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhimViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_item,parent,false)
        return PhimViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: PhimViewHolder, position: Int) {
        holder.itemView.apply {
            val tvTenPhim = findViewById<TextView>(R.id.tvTenPhim)
            val tvMoTa = findViewById<TextView>(R.id.tvMoTa)
            val imgPhim = findViewById<ImageView>(R.id.imgPhim)
            tvTenPhim.text = list[position].title
            tvMoTa.text = list[position].desc
            imgPhim.setImageResource(list[position].image)
            holder.itemView.setOnClickListener {
                OnPhimClick.OnClickPhim(position)
            }
        }
    }
}
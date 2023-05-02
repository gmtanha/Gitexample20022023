package com.example.baitaprecycleview

import android.provider.ContactsContract.CommonDataKinds.Im
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MussicAdapter(var listMusic: MutableList<Music>):RecyclerView.Adapter<MussicAdapter.MusicViewHolder>() {
    private lateinit var onItemListener: OnItemListener
    inner class MusicViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
        private var imgHinh: ImageView
        private var tvSong: TextView
        private var tvSinger: TextView
        private var imgDelete: ImageView
        init {
            imgHinh = itemView.findViewById(R.id.imgHinh)
            tvSong = itemView.findViewById(R.id.tvSong)
            tvSinger = itemView.findViewById(R.id.tvSinger)
            imgDelete = itemView.findViewById(R.id.imgDelete)
        }
        fun bind(music: Music){
            imgHinh.setImageResource(music.image)
            tvSong.text = music.song
            tvSinger.text = music.singer
            imgDelete.setOnClickListener {
                onItemListener.onClickDelete(adapterPosition)
            }
        }
    }
    fun setOnItemClick(onItemListener: OnItemListener){
        this.onItemListener = onItemListener
    }
    interface OnItemListener{
        fun onClickDelete(position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MusicViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_item2,parent,false)
        return MusicViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listMusic.size
    }

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.bind(listMusic[position])
    }
}
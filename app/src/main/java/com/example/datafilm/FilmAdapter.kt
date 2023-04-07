package com.example.datafilm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class FilmAdapter ( var listfilm : ArrayList<DataFilm>):RecyclerView.Adapter<FilmAdapter.ViewHolder>() {
    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        var img = itemView.findViewById<ImageView>(R.id.filmImg)
        var judul = itemView.findViewById<TextView>(R.id.judul)
        var tanggal = itemView.findViewById<TextView>(R.id.tanggal)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_film,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: FilmAdapter.ViewHolder, position: Int) {
        var data = listfilm[position]
        holder.img.setImageResource(data.image)
        holder.judul.text = data.judul
        holder.tanggal.text = data.tgl.toString()


    }

    override fun getItemCount(): Int {
        return listfilm.size
    }

    fun setFilmData(listfilm: ArrayList<DataFilm>){
        this.listfilm = listfilm
    }


}


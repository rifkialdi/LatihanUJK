package com.example.latihan_ujk.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.latihan_ujk.databinding.ItemListKategoriBinding
import com.example.latihan_ujk.model.Kategori

class ListKategoriAdapter(val itemKategori: Kategori) : RecyclerView.Adapter<ListKategoriAdapter.ListViewHolder>() {
    class ListViewHolder(val binding : ItemListKategoriBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        return ListViewHolder(ItemListKategoriBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val data = itemKategori.itemKategori[position]
        holder.binding.idnameJenis.text = data.name
        Glide.with(holder.binding.root)
            .load(data.image)
            .fitCenter()
            .into(holder.binding.idimgItem)
    }

    override fun getItemCount(): Int {
        return itemKategori.itemKategori.size
    }
}
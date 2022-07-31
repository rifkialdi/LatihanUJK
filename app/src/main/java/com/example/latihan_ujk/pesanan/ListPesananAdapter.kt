package com.example.latihan_ujk.pesanan

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.latihan_ujk.databinding.ItemListPesananBinding
import com.example.latihan_ujk.model.Kategori
import com.example.latihan_ujk.model.PesananModel

class ListPesananAdapter(private val onItemClickCallback: IOnItemClickCallback) : RecyclerView.Adapter<ListPesananAdapter.ListViewHolder>() {

    var listPesanan = ArrayList<PesananModel?>()

    fun tambahData(data: PesananModel?) {
        this.listPesanan.add(data)
    }

    class ListViewHolder(val binding: ItemListPesananBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        return ListViewHolder(ItemListPesananBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val data = listPesanan[position]
        holder.binding.idtvNama.text = data?.nama
        holder.binding.idtvHarga.text = data?.harga

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(data)
        }
    }

    override fun getItemCount(): Int {
        return listPesanan.size
    }

    interface IOnItemClickCallback {
        fun onItemClicked(data: PesananModel?)
    }
}
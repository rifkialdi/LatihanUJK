package com.example.latihan_ujk.bengkel

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.latihan_ujk.databinding.ItemListBengkelBinding
import com.example.latihan_ujk.model.PesananModel

class BengkelAdapter(val onItemClickCallback: IOnItemClickCallback) : RecyclerView.Adapter<BengkelAdapter.DapurViewHolder>() {

    var listDapur = ArrayList<PesananModel>()

    fun delete(index: Int) {
        this.listDapur.removeAt(index)
    }

    class DapurViewHolder(val binding: ItemListBengkelBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DapurViewHolder {
        return DapurViewHolder(ItemListBengkelBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: DapurViewHolder, position: Int) {
        val data = listDapur[position]
        holder.binding.idtvNama.text = data.nama
        holder.binding.idtvNomerMeja.text = "No Plat\n${data.nomePlat}"
        holder.binding.idtvHarga.text = "Rp. ${data.harga}"
        holder.binding.idtvWaktu.text = data.waktu

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(data, position)
        }
    }

    override fun getItemCount(): Int {
        return listDapur.size
    }

    interface IOnItemClickCallback {
        fun onItemClicked(data: PesananModel, position: Int)
    }
}
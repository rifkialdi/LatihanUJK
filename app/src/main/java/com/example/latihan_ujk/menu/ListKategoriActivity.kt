package com.example.latihan_ujk.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.example.latihan_ujk.adapter.ListKategoriAdapter
import com.example.latihan_ujk.databinding.ActivityListKategoriBinding
import com.example.latihan_ujk.model.ItemKategori
import com.example.latihan_ujk.model.Kategori

class ListKategoriActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListKategoriBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListKategoriBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val getData = intent.getParcelableExtra<Kategori>("kategori") as Kategori
        source(getData)
    }

    fun source(dataKategori: Kategori) {
        val kategori = Kategori(dataKategori.kategori, dataKategori.itemKategori)

        binding.idrvListkategori.apply {
            val adapterRv = ListKategoriAdapter(kategori)
            adapter = adapterRv
            adapterRv.onItemClick(object : ListKategoriAdapter.IOnItemClickCallback {
                override fun onItemClicked(item: ItemKategori) {
                    Toast.makeText(this@ListKategoriActivity, "Kamu memilih ${item.name}", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this@ListKategoriActivity, DetailListKategoriActivity::class.java)
                    intent.putExtra("detaillistkategori", item)
                    intent.putExtra("kategori", dataKategori.kategori)
                    startActivity(intent)
                }
            })
            layoutManager = GridLayoutManager(this@ListKategoriActivity, 2)
        }
    }
}
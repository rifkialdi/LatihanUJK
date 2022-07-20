package com.example.latihan_ujk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
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
            adapter = ListKategoriAdapter(kategori)
            layoutManager = GridLayoutManager(this@ListKategoriActivity, 2)
        }
    }
}
package com.example.latihan_ujk.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.Glide
import com.example.latihan_ujk.databinding.ActivityDetailListKategoriBinding
import com.example.latihan_ujk.model.ItemKategori
import com.example.latihan_ujk.model.Kategori

class DetailListKategoriActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailListKategoriBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailListKategoriBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val getData = intent.getParcelableExtra<ItemKategori>("detaillistkategori")!!
        val getKategori = intent.getStringExtra("kategori")

        binding.idtvKategori.text = getKategori
        binding.idtvNama.text = getData.name
        binding.idtvDeskripsi.text = getData.deskripsi
        binding.idtvHarga.text = "HARGA : ${getData.harga}"
        Glide.with(this)
            .load(getData.image)
            .fitCenter()
            .into(binding.idimgKategori)
    }
}
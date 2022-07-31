package com.example.latihan_ujk.pesanan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.latihan_ujk.R
import com.example.latihan_ujk.databinding.ActivityListPesananBinding
import com.example.latihan_ujk.key.Key
import com.example.latihan_ujk.menu.KategoriActivity

class ListPesananActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListPesananBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListPesananBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val getNoMeja = intent.getStringExtra(Key.KEY_NO_MEJA)

        binding.idbtnKirim.setOnClickListener {

        }

        binding.idbtnTambah.setOnClickListener {
            val intent = Intent(this, KategoriActivity::class.java)
            intent.putExtra(Key.KEY_NO_MEJA, getNoMeja)
            startActivity(intent)
        }
    }
}
package com.example.latihan_ujk.pesanan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.latihan_ujk.R
import com.example.latihan_ujk.databinding.ActivityListPesananBinding
import com.example.latihan_ujk.key.Key
import com.example.latihan_ujk.menu.KategoriActivity
import com.example.latihan_ujk.model.PesananModel

class ListPesananActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListPesananBinding
    private lateinit var adapterr: ListPesananAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListPesananBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val getNoMeja = intent.getStringExtra(Key.KEY_NO_MEJA)
        val getPesanan = intent.getParcelableExtra<PesananModel>(Key.KEY_KATEGORI)

        binding.idbtnKirim.setOnClickListener {

        }

        binding.idbtnTambah.setOnClickListener {
            val intent = Intent(this, KategoriActivity::class.java)
            intent.putExtra(Key.KEY_NO_MEJA, getNoMeja)
            startActivity(intent)
        }

        adapterr = ListPesananAdapter(object : ListPesananAdapter.IOnItemClickCallback {
            override fun onItemClicked(data: PesananModel?) {
                Toast.makeText(this@ListPesananActivity, data?.nama, Toast.LENGTH_SHORT).show()
            }
        })
        showListPesanan(getPesanan)
    }

    fun showListPesanan(data: PesananModel?) {
        binding.idrvListpesanan.apply {
            adapter = adapterr
            adapterr.tambahData(data)
            Log.e("TAG", "showListPesanan: ${adapterr.listPesanan}", )
            layoutManager = LinearLayoutManager(this@ListPesananActivity)
        }
    }
}
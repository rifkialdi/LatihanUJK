package com.example.latihan_ujk.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.latihan_ujk.R
import com.example.latihan_ujk.databinding.ActivityKategoriBinding
import com.example.latihan_ujk.datamenu.DataMenu
import com.example.latihan_ujk.model.Kategori

class KategoriActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityKategoriBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKategoriBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.idbtnMakanan.setOnClickListener(this)
        binding.idbtnMinuman.setOnClickListener(this)
        binding.idbtnDessert.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.idbtn_makanan -> {
                val intent = Intent(this@KategoriActivity, ListKategoriActivity::class.java)
                intent.putExtra("kategori", Kategori("Makanan", DataMenu.dataMakanan))
                startActivity(intent)
            }
            R.id.idbtn_minuman -> {
                val intent = Intent(this@KategoriActivity, ListKategoriActivity::class.java)
                intent.putExtra("kategori", Kategori("Minuman", DataMenu.dataMinuman))
                startActivity(intent)
            }
            R.id.idbtn_dessert -> {
                val intent = Intent(this@KategoriActivity, ListKategoriActivity::class.java)
                intent.putExtra("kategori", Kategori("Dessert", DataMenu.dataDessert))
                startActivity(intent)
            }
        }
    }
}
package com.example.latihan_ujk.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import com.example.latihan_ujk.R
import com.example.latihan_ujk.data.DataBengkel
import com.example.latihan_ujk.databinding.ActivityKategoriBinding
import com.example.latihan_ujk.key.Key
import com.example.latihan_ujk.model.Kategori

class KategoriActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityKategoriBinding
    private var getNoPlat: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKategoriBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Kategori Sparepart"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        getNoPlat = intent.getStringExtra(Key.KEY_NO_PLAT)

        binding.idbtnMakanan.setOnClickListener(this)
        binding.idbtnMinuman.setOnClickListener(this)
        binding.idbtnDessert.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.idbtn_makanan -> {
                val intent = Intent(this@KategoriActivity, ListKategoriActivity::class.java)
                intent.putExtra(Key.KEY_KATEGORI, Kategori("Motor", DataBengkel.dataMakanan))
                intent.putExtra(Key.KEY_NO_PLAT, getNoPlat)
                startActivity(intent)
            }
            R.id.idbtn_minuman -> {
                val intent = Intent(this@KategoriActivity, ListKategoriActivity::class.java)
                intent.putExtra(Key.KEY_KATEGORI, Kategori("Mobil", DataBengkel.dataMinuman))
                intent.putExtra(Key.KEY_NO_PLAT, getNoPlat)
                startActivity(intent)
            }
            R.id.idbtn_dessert -> {
                val intent = Intent(this@KategoriActivity, ListKategoriActivity::class.java)
                intent.putExtra(Key.KEY_KATEGORI, Kategori("Sepeda", DataBengkel.dataDessert))
                intent.putExtra(Key.KEY_NO_PLAT, getNoPlat)
                startActivity(intent)
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }
}
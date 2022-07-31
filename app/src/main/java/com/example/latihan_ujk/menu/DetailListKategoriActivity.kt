package com.example.latihan_ujk.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.bumptech.glide.Glide
import com.example.latihan_ujk.R
import com.example.latihan_ujk.databinding.ActivityDetailListKategoriBinding
import com.example.latihan_ujk.key.Key
import com.example.latihan_ujk.model.ItemKategori
import com.example.latihan_ujk.model.Kategori
import com.example.latihan_ujk.pesanan.PesananActivity

class DetailListKategoriActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailListKategoriBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailListKategoriBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val getData = intent.getParcelableExtra<ItemKategori>(Key.KEY_DETAIL_KATEGORI)!!
        val getKategori = intent.getStringExtra(Key.KEY_KATEGORI)!!
        val getNoMejaPesanan = intent.getStringExtra(Key.KEY_NO_MEJA)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = getKategori

        binding.idtvKategori.text = getKategori
        binding.idtvNama.text = getData.nama
        binding.idtvDeskripsi.text = getData.deskripsi
        binding.idtvHarga.text = "HARGA : ${getData.harga}"
        Glide.with(this)
            .load(getData.image)
            .fitCenter()
            .into(binding.idimgKategori)

        binding.idbtnPesan.setOnClickListener {
            Log.e("NO $getNoMejaPesanan", "onCreate: $getData | $getKategori", )
            showDialog(getData, getNoMejaPesanan)
        }
    }

    fun showDialog(data: ItemKategori, noMeja: String?) {
        val title = if (noMeja != null) "Yakin ingin memesan ini?" else "Anda belum memilih No Meja makanan"
        val messege = if (noMeja != null) "No meja : $noMeja \nMenu : ${data.nama} \nHarga : ${data.harga}" else "Pilih No Meja dulu ?"

        val dialog = AlertDialog.Builder(this)
        dialog.setTitle(title)
            .setMessage(messege)
            .setPositiveButton("Ya") {_, _ ->
                if (noMeja != null) {
                    Toast.makeText(this, "Ditambahkan", Toast.LENGTH_SHORT).show()
                } else {
                    startActivity(Intent(this, PesananActivity::class.java))
                }
            }
            .setNegativeButton("Batal") { dialog, _ ->
                dialog.cancel()
            }
            .create()
            .show()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }

}
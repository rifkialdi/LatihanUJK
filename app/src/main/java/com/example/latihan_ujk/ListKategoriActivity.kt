package com.example.latihan_ujk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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
        setContentView(R.layout.activity_list_kategori)

        source("tes")
    }

    fun source(dataKategori: String) {
        val dataImage = arrayListOf<String>(
            "https://upload.wikimedia.org/wikipedia/commons/a/a4/Pizza.jpg",
            "https://cdn-cas.orami.co.id/parenting/original_images/ayam_pedas_korea.jpg",
            "https://selerasa.com/wp-content/uploads/2015/12/images_daging_ayam-bakar-madu-pedas.jpg",
            "https://thumbs.dreamstime.com/b/spaghetti-bolognese-black-serving-platter-fresh-basil-parmesan-44237816.jpg",
            "https://selerasa.com/wp-content/uploads/2015/12/images_daging_ayam-goreng-1200x720.jpg",
            "https://img-global.cpcdn.com/recipes/3df4b7a9cecaf11d/680x482cq70/sate-kelinci-bumbu-kacang-foto-resep-utama.jpg"
        )

        val dataName = arrayListOf<String>(
            "Pizza",
            "Ayam Korea",
            "Ayam Madu Bakar",
            "Spagetti",
            "Ayam Goreng",
            "Sate Kelinci"
        )

        val dataDeskripsi = arrayListOf<String>(
            "Pizza dengan topping pilihan dan gurih",
            "Ayam khas korea yang di bakar dan di beri bumbu",
            "Ayam madu yang di bakar dan di beri rempah - rempah",
            "Spagetti lembut dan enak dengan kaldu",
            "Ayam goreng garing gurih dan krispi",
            "Sate kelinci dengan bumbu pilihan"
        )

        val dataHarga = arrayListOf<String>(
            "50000",
            "30000",
            "35000",
            "29000",
            "25000",
            "45000"
        )

        val dataItemKategori = arrayListOf<ItemKategori>()
        for (item in dataName.indices) {
            dataItemKategori.add(ItemKategori(dataImage[item], dataName[item], dataDeskripsi[item], dataHarga[item]))
        }
        Log.e("TAG", "source: ${Kategori(dataKategori, dataItemKategori)}")

        binding.idrvListkategori.apply {
            adapter = ListKategoriAdapter(Kategori(dataKategori, dataItemKategori))
            layoutManager = GridLayoutManager(this@ListKategoriActivity, 2)
        }
    }
}
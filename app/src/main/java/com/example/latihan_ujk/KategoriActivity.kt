package com.example.latihan_ujk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.latihan_ujk.databinding.ActivityKategoriBinding

class KategoriActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityKategoriBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKategoriBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.idbtnMakanan.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.idbtn_makanan -> {
                startActivity(Intent(this, ListKategoriActivity::class.java))
            }
        }
    }
}
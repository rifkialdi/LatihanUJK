package com.example.latihan_ujk.pesanan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.latihan_ujk.R
import com.example.latihan_ujk.databinding.ActivityPesananBinding

class PesananActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityPesananBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPesananBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.idbtnLanjut.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.idbtn_lanjut -> {
                val noMeja = binding.idedtNomermeja.text.toString()
                if (noMeja.isEmpty()) {
                    binding.idedtNomermeja.error = "Tidak boleh kosong"
                }
            }
        }
    }
}
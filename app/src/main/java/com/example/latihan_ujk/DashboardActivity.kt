package com.example.latihan_ujk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.latihan_ujk.databinding.ActivityDashboardBinding
import com.example.latihan_ujk.menu.KategoriActivity
import com.example.latihan_ujk.pesanan.PesananActivity

class DashboardActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.idbtnMenu.setOnClickListener(this)
        binding.idbtnPesanan.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.idbtn_menu -> {
                startActivity(Intent(this, KategoriActivity::class.java))
            }
            R.id.idbtn_pesanan-> {
                Log.e("TAG", "onClick: hahahahah", )
                startActivity(Intent(this, PesananActivity::class.java))
            }
        }
    }
}
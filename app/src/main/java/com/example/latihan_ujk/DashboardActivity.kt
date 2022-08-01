package com.example.latihan_ujk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.latihan_ujk.dapur.DapurActivity
import com.example.latihan_ujk.databinding.ActivityDashboardBinding
import com.example.latihan_ujk.key.Key
import com.example.latihan_ujk.menu.KategoriActivity
import com.example.latihan_ujk.pesanan.PesananActivity

class DashboardActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityDashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Dashboard"

        binding.idbtnMenu.setOnClickListener(this)
        binding.idbtnPesanan.setOnClickListener(this)
        binding.idbtnDapur.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.idbtn_menu -> {
                val intent = Intent(this, KategoriActivity::class.java)
                intent.putExtra(Key.KEY_DASHBOARD, "Menu")
                startActivity(intent)
            }
            R.id.idbtn_pesanan -> {
                val intent = Intent(this, PesananActivity::class.java)
                intent.putExtra(Key.KEY_DASHBOARD, "Pesanan")
                startActivity(intent)
            }
            R.id.idbtn_dapur -> {
                startActivity(Intent(this, DapurActivity::class.java))
            }
        }
    }
}
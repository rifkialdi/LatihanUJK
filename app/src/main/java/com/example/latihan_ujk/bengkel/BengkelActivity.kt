package com.example.latihan_ujk.bengkel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.latihan_ujk.databinding.ActivityBengkelBinding
import com.example.latihan_ujk.db.MappingHelper
import com.example.latihan_ujk.db.PesananHelper
import com.example.latihan_ujk.model.PesananModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class BengkelActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBengkelBinding
    private lateinit var pesananHelper: PesananHelper
    private lateinit var adapterr: BengkelAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBengkelBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Bengkel"

        adapterr = BengkelAdapter(object : BengkelAdapter.IOnItemClickCallback {
            override fun onItemClicked(data: PesananModel, position: Int) {
                showDialog(data, position)
            }
        })
        showListDapur()
    }

    fun showListDapur() {
        lifecycleScope.launch {
            pesananHelper = PesananHelper.getInstance(applicationContext)
            pesananHelper.open()

            val defferedPesanan = async(Dispatchers.IO) {
                val cursor = pesananHelper.queryAll()
                MappingHelper.mapCursorToArrayList(cursor)
            }

            val dataDapur = defferedPesanan.await()
            if (dataDapur.size >0) {
                adapterr.listDapur = dataDapur
            } else {
                adapterr.listDapur = arrayListOf()
            }
            pesananHelper.close()
            showRvDapur()
        }
    }

    fun showRvDapur() {
        binding.idrvDapur.apply {
            adapter = adapterr
            layoutManager = LinearLayoutManager(this@BengkelActivity)
        }
    }

    fun showDialog(data: PesananModel, position: Int) {
        val dialog = AlertDialog.Builder(this)
            dialog.setTitle("Confirmasi")
                .setMessage("Apakah item sudah siap ?")
                .setPositiveButton("Sudah") { _, _ ->
                    pesananHelper.open()
                    pesananHelper.deleteById(data.id.toString())
                    adapterr.delete(position)
                    showRvDapur()
                }
                .setNegativeButton("Batal") { dialog, _ ->
                    dialog.cancel()
                }
                .create()
                .show()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }
}
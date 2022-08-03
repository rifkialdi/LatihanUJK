package com.example.latihan_ujk.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PesananModel(
    val id: Int,
    val nomePlat: String,
    val nama: String,
    val harga: String,
    val waktu: String
) : Parcelable

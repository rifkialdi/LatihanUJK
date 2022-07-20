package com.example.latihan_ujk.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Kategori(
    val kategori: String,
    val ItemKategori: List<ItemKategori>
) : Parcelable

@Parcelize
data class ItemKategori(
    val image: String,
    val name: String,
    val deskripsi: String,
    val harga: String
) : Parcelable
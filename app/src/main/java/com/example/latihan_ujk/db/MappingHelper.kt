package com.example.latihan_ujk.db

import android.database.Cursor
import android.util.Log
import com.example.latihan_ujk.model.PesananModel

object MappingHelper {
    fun mapCursorToArrayList(notesCursor: Cursor?): ArrayList<PesananModel> {
        val notesList = ArrayList<PesananModel>()
        notesCursor?.apply {
            while (moveToNext()) {
                val id = getInt(getColumnIndexOrThrow(DatabaseContract.NoteColumn._ID))
                val nomerMeja = getString(getColumnIndexOrThrow(DatabaseContract.NoteColumn.NOMER_MEJA))
                val nama = getString(getColumnIndexOrThrow(DatabaseContract.NoteColumn.NAMA))
                val harga = getString(getColumnIndexOrThrow(DatabaseContract.NoteColumn.HARGA))
                val waktu = getString(getColumnIndexOrThrow(DatabaseContract.NoteColumn.WAKTU))
                notesList.add(PesananModel(id, nomerMeja, nama, harga, waktu))
            }
        }
        return notesList
    }
}
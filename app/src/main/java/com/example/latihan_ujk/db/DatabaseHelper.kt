package com.example.latihan_ujk.db

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.latihan_ujk.db.DatabaseContract.NoteColumn.Companion.TABLE_NAME
import com.example.latihan_ujk.db.DatabaseContract.NoteColumn
import com.example.latihan_ujk.db.DatabaseContract.NoteColumn.Companion.WAKTU

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    companion object {
        private const val DATABASE_NAME = "dbpesanan"
        private const val DATABASE_VERSION = 1
        private const val SQL_CREATE_TABLE_NOTE = "CREATE TABLE $TABLE_NAME" +
                "(${NoteColumn._ID} INTEGER PRIMARY KEY AUTOINCREMENT," +
                "${NoteColumn.NOMER_PLAT} VARCHAR(2)," +
                "${NoteColumn.NAMA} VARCHAR(50)," +
                "${NoteColumn.HARGA} VARCHAR(10)," +
                "${WAKTU} VARCHAR(20));"
    }

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(SQL_CREATE_TABLE_NOTE)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }
}
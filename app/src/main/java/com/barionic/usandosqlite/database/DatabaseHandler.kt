package com.barionic.usandosqlite.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHandler(context: Context): SQLiteOpenHelper(context, "banco.db", null, 1) {
    override fun onCreate(banco: SQLiteDatabase?) {
        banco?.execSQL("CREATE TABLE IF NOT EXISTS cadastro(_id INTEGER PRIMARY KEY AUTOINCREMENT, nome TEXT, telefone TEXT)")
    }

    override fun onUpgrade(
        banco: SQLiteDatabase?,
        oldVersion: Int,
        newVersion: Int
    ) {
        banco?.execSQL("DROP TABLE IF EXISTS cadastro")
        this.onCreate(banco)
    }


}
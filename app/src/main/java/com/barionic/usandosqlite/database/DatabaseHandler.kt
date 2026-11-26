package com.barionic.usandosqlite.database

import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.barionic.usandosqlite.entity.Cadastro

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

    fun incluir(cadastro: Cadastro){}

    fun alterar(cadastro: Cadastro){}

    fun excluir(id: Int){}

    fun pesquisar(id: Int): Cadastro?{
        return null
    }

    fun listarCursor(): Cursor?{
        return null
    }

    fun listar(): MutableList<Cadastro>?{
        return null
    }


}
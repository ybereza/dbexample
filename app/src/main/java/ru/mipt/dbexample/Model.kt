package ru.mipt.dbexample

import android.content.Context
import android.widget.BaseAdapter

class Model(context : Context, val roomModel : Boolean = false) {

    private val dbHelper = DBHelper(context)
    private val room = ValuesDatabase.INSTANCE
    private lateinit var listAdapter : ListAdapter

    fun createAdapter() : BaseAdapter {
        listAdapter = ListAdapter(this)
        return listAdapter
    }

    fun size() : Int {}

    fun text(pos : Int) : String? {}

    fun addValue(value : String) {

    }

    fun removeLast() {
        if (roomModel) {

        }
        else {
            dbHelper.removeLast()
            listAdapter.notifyDataSetChanged()
        }
    }
}
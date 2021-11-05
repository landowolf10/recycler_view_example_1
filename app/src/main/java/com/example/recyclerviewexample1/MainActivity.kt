package com.example.recyclerviewexample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample1.adapters.RecyclerAdapter
import com.example.recyclerviewexample1.models.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecycler()
    }

    fun initRecycler()
    {
        var dataSource = DataSource()

        var recyclerView = findViewById<RecyclerView>(R.id.card_view)
        recyclerView.layoutManager
        val adapter = RecyclerAdapter(dataSource.getItemList())

        //var recyclerView = findViewById<RecyclerView>(R.id.card_view)
        recyclerView.adapter = adapter
    }
}
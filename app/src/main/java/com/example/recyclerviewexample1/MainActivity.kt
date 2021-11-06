package com.example.recyclerviewexample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
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
        var recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = RecyclerAdapter(dataSource.getItemList())
        recyclerView.adapter = adapter


    }
}
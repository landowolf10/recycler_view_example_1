package com.example.recyclerviewexample1.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewexample1.R
import com.example.recyclerviewexample1.models.ModelExample

class RecyclerAdapter(private val items: List<ModelExample>): RecyclerView.Adapter<RecyclerAdapter.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder
    {
        val layoutInflater = LayoutInflater.from(parent.context).inflate(
            R.layout.card_layout,
            parent,
            false
        )

        return ViewHolder(layoutInflater)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int)
    {
        holder.render(items[position])
    }

    override fun getItemCount(): Int
    {
        return items.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        fun render(element: ModelExample)
        {
            itemView.findViewById<TextView>(R.id.first_textview).text = element.title
            itemView.findViewById<TextView>(R.id.second_textview).text = element.content

            itemView.setOnClickListener() {
                val position: Int = adapterPosition
                print("You clicked on ${element.title[position]}")
                print(element.title)
                Toast.makeText(itemView.context, "Has seleccionado la nota ${element.title}", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
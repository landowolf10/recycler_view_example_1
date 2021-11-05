package com.example.recyclerviewexample1.models

class DataSource
{
    fun getItemList(): MutableList<ModelExample>
    {
        var data: MutableList<ModelExample> = ArrayList()

        for (i in 1 ..30)
            data.add(ModelExample("Title $i", "Content $i"))

        return data
    }
}
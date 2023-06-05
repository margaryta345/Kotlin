package com.example.lb8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recycleview)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val data = ArrayList<ItemData>()

        for(i in 1..12){
            data.add(ItemData("Item"+i, R.drawable.ic_launcher_foreground, R.drawable.ic_launcher_background))
        }

        val adapter = CustomAdapter(data){position ->
            Toast.makeText(this,data[position].toString(), Toast.LENGTH_SHORT).show()
        }

        recyclerView.adapter = adapter
    }
}
package com.example.applesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewXml)

        layoutManager = LinearLayoutManager(this)
//
//        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewXml)
//
//        adapter = RecyclerAdapter()
//        recyclerView.adapter = adapter
    }
}
package com.example.applesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val appViewModel: AppViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewXml)
        recyclerView.adapter = RecyclerAdapter(emptyList())
        recyclerView.layoutManager = LinearLayoutManager(this)

        appViewModel.contactsList.observe(this, {list ->
            recyclerView.adapter = RecyclerAdapter(list)
        })
    }
}
package com.example.applesson2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val contacts = listOf(Contact("https://adobe.ly/3rdh0Hw", "Contact 1", "profession"),
            Contact("https://adobe.ly/3rdh0Hw","Contact 2", "profession"),
            Contact("https://adobe.ly/3rdh0Hw","Contact 3", "profession"),
            Contact("https://adobe.ly/3rdh0Hw","Contact 4", "profession"),
            Contact("https://adobe.ly/3rdh0Hw","Contact 5", "profession"),
            Contact("https://adobe.ly/3rdh0Hw","Contact 6", "profession"),
            Contact("https://adobe.ly/3rdh0Hw","Contact 7", "profession"),
            Contact("https://adobe.ly/3rdh0Hw","Contact 8", "profession"),
            Contact("https://adobe.ly/3rdh0Hw","Contact 9", "profession"),
            Contact("https://adobe.ly/3rdh0Hw","Contact 10", "profession"),
            Contact("https://adobe.ly/3rdh0Hw","Contact 11", "profession"), )


        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewXml)
        layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecyclerAdapter(contacts)

    }
}
package com.example.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var provider: ArrayList<Provider>
    lateinit var navigationView: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadData()
        val rv = findViewById<RecyclerView>(R.id.rv)
        val recyclerAdapter = RecylerViewAdapter(provider)
        rv.adapter = recyclerAdapter

    }

    private fun loadData() {
        provider = ArrayList()

        provider.add(Provider("Title", ""))
        provider.add(Provider("Title", ""))
        provider.add(Provider("Title", ""))
        provider.add(Provider("Title", ""))
        provider.add(Provider("Title", ""))
        provider.add(Provider("Title", ""))
        provider.add(Provider("Title", ""))
        provider.add(Provider("Title", ""))
    }
}
package com.example.animelist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import com.example.animelist.adapter.itemadapter
import com.example.animelist.data.Dataset
import com.example.animelist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var LinkXml: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        var Isshojo = true
        super.onCreate(savedInstanceState)
        LinkXml = ActivityMainBinding.inflate(layoutInflater)
        setContentView(LinkXml.root)
        LinkXml.recyclerView.adapter = itemadapter(this, Dataset.item)
        LinkXml.recyclerView.setHasFixedSize(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

}
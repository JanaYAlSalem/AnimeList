package com.example.animelist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.example.animelist.R.id.shonen
import com.example.animelist.adapter.itemadapter
import com.example.animelist.data.Dataset
import com.example.animelist.data.Dataset.item
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

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.shonen ->{ item
        return true}
     else  ->     return super.onOptionsItemSelected(item)


} // end function

    }

}
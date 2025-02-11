package edu.temple.simplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val numberArray = Array(50) { i -> (i + 1) * 5 }


        // TODO Step 1: Reference RecyclerView object
        val recyclerView =
            findViewById<RecyclerView>(R.id.recyclerView)//this was made to combat the problem of relying on the developer to implement recycling
        // recycling means that when you scroll, the textviews taht appear to you are the only views taht the computer keeps tracko f
        // not recycling could lead to slower scrolling
        val displayTextView =
            findViewById<TextView>(R.id.textView)

        //TODO Step 2: Provide a LayoutManager
        recyclerView.layoutManager = LinearLayoutManager(this)


        //TODO Step 4: Provide a RecyclerView.Adapter
        recyclerView.adapter = NumberDisplayAdapter(this@MainActivity, numberArray)

    }
}
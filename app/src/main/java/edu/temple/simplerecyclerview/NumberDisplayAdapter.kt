package edu.temple.simplerecyclerview

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter (private val _context : Context, private val _fonts : Array<Int>) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>()/* TODO Step 3a: Provide Adapter Parent */ {
    //the thee adapter must be of VH type

    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {
        // TODO Step 3b: Complete function definitions for adapter
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        return NumberViewHolder(
            TextView(
                parent.context
            ).apply{
                setPadding(10,10,10,10)
            }
        )
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
       holder.textView.text = _fonts[position].toString()
        holder.textView.textSize = _fonts[position].toFloat()
    }

    override fun getItemCount(): Int {
        return _fonts.size
    }
}
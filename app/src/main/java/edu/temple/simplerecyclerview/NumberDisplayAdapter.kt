package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.intellij.lang.annotations.JdkConstants

// Step 3: Complete adapter implementation

class NumberDisplayAdapter(private val data: List<Int>) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>()
{
    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        val textview = TextView(parent.context).apply {
    }

    return NumberViewHolder(textview)
}

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int){
        holder.textView.text = data[position].toString()
}

    override fun getItemCount(): Int = data.size

}
package edu.temple.simplerecyclerview

import android.view.Gravity
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
            setPadding(32, 24, 32, 24)
            textSize = 18f
            gravity = Gravity.START or Gravity.CENTER_VERTICAL
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            )
    }

    return NumberViewHolder(textview)
}

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int){
        holder.textView.text = data[position].toString()
}

    override fun getItemCount(): Int = data.size

}
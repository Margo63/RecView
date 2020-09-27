package com.example.recview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recview.R
import com.example.recview.model.ItemElements
import kotlinx.android.synthetic.main.item_card.view.*

class RecycleViewAdapter(var items:List<ItemElements>,var clickedListener: OnItemClickedListener): RecyclerView.Adapter<RecycleViewAdapter.ViewHolder>() {

inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    private val image = itemView.findViewById<ImageView>(R.id.imageView)
    private val title = itemView.findViewById<TextView>(R.id.textViewTitle)
    private val text = itemView.findViewById<TextView>(R.id.textView2)

    fun bind(item : ItemElements,action: OnItemClickedListener){
        image.setImageResource(item.image)
        title.text=item.title
        text.text = item.text

        itemView.setOnClickListener{
            action.onItemClicked(item,adapterPosition)
        }
    }

}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =ViewHolder(LayoutInflater.from(parent.context)
        .inflate(R.layout.item_card,parent,false))

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.bind(items[position],clickedListener)
    }
    interface OnItemClickedListener{
        fun onItemClicked(item: ItemElements,position: Int)
    }
}
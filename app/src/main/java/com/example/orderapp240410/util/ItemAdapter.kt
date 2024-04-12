package com.example.orderapp240410.util

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.orderapp240410.databinding.ItemLayoutBinding
import com.example.orderapp240410.model.Pizza

class ItemAdapter(val items: Array<Pizza>) : RecyclerView.Adapter<ItemAdapter.ViewHolder> (){
    class ViewHolder(val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root){

    }

    // implementierung des eigenen Listeners
    interface MyListener{
        fun onItemClick(position:Int)
    }

    private var myListener: MyListener? = null

    fun setMyListener(myListener: MyListener){
        this.myListener = myListener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val cardView = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolder(cardView)
    }

    override fun getItemCount()= items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val cardView = holder.binding
        cardView.tvItemName.text = items[position].name
        val imageView = cardView.imgItem
        val image = ContextCompat.getDrawable(imageView.context,items[position].imageResource)
        imageView.setImageDrawable(image)
        cardView.root.setOnClickListener{
            myListener?.onItemClick(position)
        }
    }
}












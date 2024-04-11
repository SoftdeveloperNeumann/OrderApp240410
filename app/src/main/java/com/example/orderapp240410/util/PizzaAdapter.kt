package com.example.orderapp240410.util

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.orderapp240410.databinding.PizzaLayoutBinding
import com.example.orderapp240410.model.Pizza

class PizzaAdapter(val pizzen: Array<Pizza>) : RecyclerView.Adapter<PizzaAdapter.ViewHolder> (){
    class ViewHolder(val binding: PizzaLayoutBinding) : RecyclerView.ViewHolder(binding.root){

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
        val cardView = PizzaLayoutBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolder(cardView)
    }

    override fun getItemCount()= pizzen.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val cardView = holder.binding
        cardView.tvItemName.text = pizzen[position].name
        val imageView = cardView.imgItem
        val image = ContextCompat.getDrawable(imageView.context,pizzen[position].imageResource)
        imageView.setImageDrawable(image)
        cardView.root.setOnClickListener{
            myListener?.onItemClick(position)
        }
    }
}












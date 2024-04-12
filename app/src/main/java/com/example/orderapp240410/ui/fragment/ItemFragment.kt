package com.example.orderapp240410.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.orderapp240410.databinding.FragmentItemBinding
import com.example.orderapp240410.model.Item
import com.example.orderapp240410.model.ItemArrays
import com.example.orderapp240410.ui.DetailActivity
import com.example.orderapp240410.util.ItemAdapter


class ItemFragment : Fragment() {

    lateinit var binding: FragmentItemBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentItemBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        Log.d("TAG", "onCreateView: Das Pizzafragment")

        val kategorie = requireArguments().getInt("kategorie",0) //arguments?.getInt("kategorie") // die ältere Variante

        val itemArray: Array<Item>? = when(kategorie){
            1 -> ItemArrays.pizzen
            2 -> ItemArrays.pasti
            3 -> ItemArrays.drinks
            else -> null
        }

        val adapter = ItemAdapter(itemArray!!)
        binding.itemList.adapter = adapter
//        binding.pizzaList.layoutManager = LinearLayoutManager(activity,LinearLayoutManager.HORIZONTAL,true)
//        binding.pizzaList.layoutManager = StaggeredGridLayoutManager(3,LinearLayoutManager.HORIZONTAL)
        binding.itemList.layoutManager = GridLayoutManager(activity,2)

        adapter.setMyListener(object : ItemAdapter.MyListener {
            override fun onItemClick(position: Int) {
                val item = adapter.items[position]
                val intent = Intent(activity,DetailActivity::class.java)
                intent.putExtra("name", item.name)
                intent.putExtra("image", item.imageResource)
                startActivity(intent)
            }

        })

        return binding.root
    }

}
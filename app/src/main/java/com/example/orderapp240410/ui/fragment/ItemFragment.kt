package com.example.orderapp240410.ui.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.orderapp240410.databinding.FragmentItemBinding
import com.example.orderapp240410.model.ItemArrays
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

        val adapter = ItemAdapter(ItemArrays.pizzen)
        binding.itemList.adapter = adapter
//        binding.pizzaList.layoutManager = LinearLayoutManager(activity,LinearLayoutManager.HORIZONTAL,true)
//        binding.pizzaList.layoutManager = StaggeredGridLayoutManager(3,LinearLayoutManager.HORIZONTAL)
        binding.itemList.layoutManager = GridLayoutManager(activity,2)

        adapter.setMyListener(object : ItemAdapter.MyListener {
            override fun onItemClick(position: Int) {
                val pizza = adapter.items[position]
                Toast.makeText(
                    activity,
                    "Es wurde eine Pizza ${pizza.name} ausgewählt",
                    Toast.LENGTH_SHORT
                ).show()
            }

        })

        return binding.root
    }

}
package com.example.orderapp240410.ui.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.orderapp240410.databinding.FragmentPizzaBinding
import com.example.orderapp240410.model.Pizza
import com.example.orderapp240410.util.PizzaAdapter


class PizzaFragment : Fragment() {

    lateinit var binding: FragmentPizzaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentPizzaBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        Log.d("TAG", "onCreateView: Das Pizzafragment")

        binding.pizzaList.adapter = PizzaAdapter(Pizza.pizzen)
        binding.pizzaList.layoutManager = LinearLayoutManager(activity)

        return binding.root
    }

}
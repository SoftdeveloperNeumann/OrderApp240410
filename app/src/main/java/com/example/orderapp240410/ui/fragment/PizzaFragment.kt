package com.example.orderapp240410.ui.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.orderapp240410.databinding.FragmentPizzaBinding


class PizzaFragment : Fragment() {

    lateinit var binding: FragmentPizzaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentPizzaBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        Log.d("TAG", "onCreateView: Das Pizzafragment")
        return binding.root
    }

}
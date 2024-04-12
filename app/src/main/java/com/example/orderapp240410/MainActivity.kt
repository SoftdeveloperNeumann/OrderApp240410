package com.example.orderapp240410

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.orderapp240410.databinding.ActivityMainBinding
import com.example.orderapp240410.ui.fragment.MainFragment
import com.example.orderapp240410.ui.fragment.ItemFragment
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var tabNames: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        tabNames = resources.getStringArray(R.array.kategorien)

        binding.pager.adapter = object : FragmentStateAdapter(supportFragmentManager, lifecycle) {
            override fun getItemCount() = tabNames.size

            override fun createFragment(position: Int): Fragment {
               return when(position){
                   0 -> MainFragment()
                   1 -> ItemFragment()
                   else -> Fragment()
               }
            }
        }
        TabLayoutMediator(binding.tabs,binding.pager){tab,position ->
            tab.text = tabNames[position]
        }.attach()

    }
}
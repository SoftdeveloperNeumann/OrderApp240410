package com.example.orderapp240410

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.orderapp240410.databinding.ActivityMainBinding
import com.example.orderapp240410.ui.fragment.ItemFragment
import com.example.orderapp240410.ui.fragment.MainFragment
import com.google.android.material.tabs.TabLayoutMediator

var status = 0

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var tabNames: Array<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("TAG", "create: status = $status")
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        tabNames = resources.getStringArray(R.array.kategorien)

        binding.pager.adapter = object : FragmentStateAdapter(supportFragmentManager, lifecycle) {
            override fun getItemCount() = tabNames.size

            override fun createFragment(position: Int): Fragment {
                return when (position) {
                    0 -> MainFragment()

                    else -> {
                        Log.d("TAG", "createFragment: status = $status")

                        ItemFragment().apply {
                            arguments = Bundle().apply {
                                putInt("kategorie", position)

                            }
                        }

                    }
                }
            }
        }



        TabLayoutMediator(binding.tabs, binding.pager) { tab, position ->
            tab.text = tabNames[position]

        }.attach()

        binding.pager.currentItem = status
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        status=  binding.pager.currentItem
        Log.d("TAG", "onSaveInstanceState: status = ${binding.tabs.selectedTabPosition}")
    }

}
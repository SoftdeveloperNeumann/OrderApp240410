package com.example.orderapp240410.model

import com.example.orderapp240410.R

data class Pizza(
    val name: String,
    val imageResource: Int,
) {

    companion object{
        val pizzen = arrayOf(
            Pizza("Fresca", R.drawable.pizza_fresca),
            Pizza("Kiwi", R.drawable.pizza_kiwi),
            Pizza("Salami", R.drawable.pizza_salami),
            Pizza("Fresca2", R.drawable.pizza_fresca),
            Pizza("Kiwi2", R.drawable.pizza_kiwi),
            Pizza("Salami2", R.drawable.pizza_salami)
        )
    }
}
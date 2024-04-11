package com.example.orderapp240410.model

import com.example.orderapp240410.R

object ItemArrays {
    val pizzen = arrayOf(
        Pizza("Fresca", R.drawable.pizza_fresca),
        Pizza("Kiwi", R.drawable.pizza_kiwi),
        Pizza("Salami", R.drawable.pizza_salami),
        Pizza("Fresca2", R.drawable.pizza_fresca),
        Pizza("Kiwi2", R.drawable.pizza_kiwi),
        Pizza("Salami2", R.drawable.pizza_salami)
    )

    val pasti = arrayOf(
        Pasta("Nudeln 1", R.drawable.nudel1),
        Pasta("Nudeln 2", R.drawable.nudel2),
        Pasta("Nudeln 3", R.drawable.nudel3),
        Pasta("Nudeln 4", R.drawable.nudel1),
        Pasta("Nudeln 5", R.drawable.nudel2),
        Pasta("Nudeln 6", R.drawable.nudel3),
    )

    val drinks = arrayOf(
        Drink("Drink 1", R.drawable.drink1),
        Drink("Drink 2", R.drawable.drink2),
        Drink("Drink 3", R.drawable.drink3),
        Drink("Drink 4", R.drawable.drink1),
        Drink("Drink 5", R.drawable.drink2),
        Drink("Drink 6", R.drawable.drink3),
    )
}
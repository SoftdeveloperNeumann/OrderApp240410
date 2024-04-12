package com.example.orderapp240410.model

data class Drink (
    override val name:String,
    override val imageResource: Int
    ) :Item{
//        companion object {
//            val drinks = arrayOf(
//                Drink("Drink 1", R.drawable.drink1),
//                Drink("Drink 2", R.drawable.drink2),
//                Drink("Drink 3", R.drawable.drink3),
//                Drink("Drink 4", R.drawable.drink1),
//                Drink("Drink 5", R.drawable.drink2),
//                Drink("Drink 6", R.drawable.drink3),
//            )
//        }
}
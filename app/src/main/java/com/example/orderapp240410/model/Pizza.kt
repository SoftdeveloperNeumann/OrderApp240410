package com.example.orderapp240410.model

data class Pizza(override val name: String,
                 override val imageResource: Int,) : Item

 {

//    companion object{
//        val pizzen = arrayOf(
//            Pizza("Fresca", R.drawable.pizza_fresca),
//            Pizza("Kiwi", R.drawable.pizza_kiwi),
//            Pizza("Salami", R.drawable.pizza_salami),
//            Pizza("Fresca2", R.drawable.pizza_fresca),
//            Pizza("Kiwi2", R.drawable.pizza_kiwi),
//            Pizza("Salami2", R.drawable.pizza_salami)
//        )
//    }
}
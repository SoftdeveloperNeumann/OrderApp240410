package com.example.orderapp240410.model


data class Pasta(
    override val name:String,
    override val imageResource: Int
) :Item{
//    companion object{
//        val pasti = arrayOf(
//            Pasta("Nudeln 1", R.drawable.nudel1),
//            Pasta("Nudeln 2", R.drawable.nudel2),
//            Pasta("Nudeln 3", R.drawable.nudel3),
//            Pasta("Nudeln 4", R.drawable.nudel1),
//            Pasta("Nudeln 5", R.drawable.nudel2),
//            Pasta("Nudeln 6", R.drawable.nudel3),
//        )
//    }
}
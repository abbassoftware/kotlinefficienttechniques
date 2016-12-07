package com.kotlineffiecienttechniques

open public class Book (var ISBN: String, var price: Float, var quantity: Int,
                   var title: String , var description: String){

    open fun getShippingPrice():Float {
        return price;
    }
}

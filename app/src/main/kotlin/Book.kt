package com.kotlineffiecienttechniques

open public class Book (val aISBN: String, val aprice: Float, val aquantity: Int,
                   val atitle: String , val adescription: String){
    public var ISBN: String? = aISBN
    public var price: Float = aprice
    public var quantity: Int = aquantity
    public var title: String? = atitle
    public var description: String? = adescription


    open fun getShippingPrice():Float {
        return price;
    }
}

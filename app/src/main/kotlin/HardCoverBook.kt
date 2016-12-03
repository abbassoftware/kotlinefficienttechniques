
package com.kotlineffiecienttechniques

class HardCoverBook(aISBN: String,aprice: Float,aquantity: Int,
                    atitle: String , adescription: String) :
        Book(aISBN,aprice,aquantity,atitle,adescription) {

    override fun getShippingPrice():Float {
        return price + 3.0f;
    }
}

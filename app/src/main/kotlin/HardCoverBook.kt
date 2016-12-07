
package com.kotlineffiecienttechniques

class HardCoverBook(ISBN: String, price: Float, quantity: Int,
                    title: String , description: String) :
        Book(ISBN, price, quantity, title, description) {

    override fun getShippingPrice():Float {
        return price + 3.0f;
    }
}

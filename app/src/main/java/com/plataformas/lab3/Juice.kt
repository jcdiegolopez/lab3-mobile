package com.plataformas.lab3

class Juice(name: String, price: Double) : Drink(name, price) {

    override fun pour(){
        println("El jugo $name se esta sirviendo")
    }

    override fun cook(){
        println("El jugo $name se debe de hacerse mediante frutas vegetales u otros.")
    }
}
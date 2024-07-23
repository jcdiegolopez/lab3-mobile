package com.plataformas.lab3

abstract class Drink(name: String, price: Double) :  Food(name, price) {

    abstract fun pour()

}
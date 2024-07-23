package com.plataformas.lab3

class IceCream(name: String, price: Double) : Food(name, price), Dessert {
    override fun cook() {
        println("El helado $name, luego de realizado debe meterse al congelador por 30 minutos")
    }

    override fun eat() {
        println("El helado $name debe de comerse rapidamente para que no se derrita")
    }

}
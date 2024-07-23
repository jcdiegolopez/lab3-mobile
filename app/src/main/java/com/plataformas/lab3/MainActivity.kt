package com.plataformas.lab3

fun main(){
    var hamburguer = Burguer("Angus", 20.0)
    var pizza = Pizza("Napolitona", 30.0)
    var juice = Juice("Frutalle", 10.0)
    var iceCream = IceCream("Fresa", 5.0)

    hamburguer.cook()
    pizza.cook()
    juice.cook()
    iceCream.cook()
    iceCream.eat()
    juice.pour()
    println("El precio con descuento es ${hamburguer.discountPrice(0.1)}")
}

fun Food.discountPrice(discount: Double) : Double{
    return this.price - (this.price * discount)
}
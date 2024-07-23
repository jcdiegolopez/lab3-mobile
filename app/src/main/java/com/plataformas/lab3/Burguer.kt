package com.plataformas.lab3

class Burguer(name: String, price: Double) : Food(name, price) {

    override fun cook() {
        println("La hamburguesa $name con solo unas gotas de aceite " +
                "para que no se pegue. Con el fuego muy fuerte y dando " +
                "a vuelta a la hamburguesa a los 3 ó 5 minutos para que" +
                " se ase por los dos lados, ya conseguirás una sabrosa " +
                "hamburguesa tostada por fuera y jugosa, en su punto, por dentro.")
    }

}
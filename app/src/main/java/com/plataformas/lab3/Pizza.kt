package com.plataformas.lab3

class Pizza(name: String, price: Double) : Food(name, price) {
    override fun cook() {
        println("La pizza $name Es básico que la temperatura del" +
                " horno sea alta y que la pizza esté dentro de 12 a 16 minutos." +
                " Debemos cocinar la masa con el horno ya precalentado " +
                "a 250 grados C, 12-16 minutos. La temperatura ha de ser alta, y el tiempo corto.")

    }

}
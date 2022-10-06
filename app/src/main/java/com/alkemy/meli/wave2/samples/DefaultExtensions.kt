package com.alkemy.meli.wave2.samples

class DefaultExtensions {

    data class Car(var name: String = "Camaro", var cor: String = "Amarelo")
    data class History(var car: Car, var events: List<String>? = null)

    fun sampleLet() {
        val car = Car()

        val msg = car.let {
            it.name = "Mustange"
            "O nome do carro é ${it.name}"
            //"outro texto"

            33
        }

        println(msg)
    }


    fun samplesApply() {
        val car = Car()

        car.apply {
            val outroNomeDeCar = "Brasilia"

            name = outroNomeDeCar
            cor = "Azul"
        }


        println(car)
    }

    fun samplesAlso() {
        val car = Car()

        val result = car.also {
            it.cor = "Preto"
            it.name = "Brasilia"
        }

        println(car)
        println(result)
    }


    fun samplesRun() {

        val car = Car()

        val history = car.run {
            this.cor = "Preto"
            this.name = "Brasilia"
            History(this)
        }

        println(car)
        println(history)
    }


    data class AReallyBigClassName(var a: String, val b: String, val c: Int)

    fun sampleWith() {
        val aReallyBigClassName = AReallyBigClassName("XXXXXX", "YYYY", 999999)

        with(aReallyBigClassName) {
            println(this.a)
            println(this.b)
            println(this.c)
        }
    }
}
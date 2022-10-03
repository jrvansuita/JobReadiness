package com.alkemy.meli.wave2.samples

@Suppress("JoinDeclarationAndAssignment")
class Laziness {

    //lateinit
    private lateinit var lateText: String

    init {
        lateText = "lateText"
    }

    //lazy
    private val lazyText by lazy { "lazyText" }


}
package com.alkemy.meli.wave2.samples

import android.app.Activity
import android.os.Bundle
import com.alkemy.meli.wave2.R
import com.alkemy.meli.wave2.car.extensions.getStringComSeta
import com.alkemy.meli.wave2.car.extensions.getTwoStrings

class ExtensionsActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val share = getString(R.string.share)

        //share == Compartilhar

        val shareComSeta = "-> ${getString(R.string.favorites)}"

        //shareComSeta == -> Compartilhar


        //Forma com Extensions

        val shareComSeta2 = getStringComSeta(R.string.share)
        val twoString = getTwoStrings(R.string.share, R.string.favorites)
        // Compartilhar - Favoritos


        //Universal
        //binding.testanto()
        //viewModel.testanto()
    }
}
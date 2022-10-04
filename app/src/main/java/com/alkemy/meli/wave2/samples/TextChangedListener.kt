package com.alkemy.meli.wave2.samples

import android.app.Activity
import android.os.Bundle
import android.util.Log
import androidx.core.widget.addTextChangedListener
import com.alkemy.meli.wave2.databinding.ActivityCarDetailBinding

class TextChangedListener : Activity() {

    //Any Binding
    private lateinit var binding: ActivityCarDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCarDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.editText.addTextChangedListener {
            Log.v("MUDOU", it.toString())
        }
    }
}
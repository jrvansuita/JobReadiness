package com.alkemy.meli.wave2.ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.alkemy.meli.wave2.car.ui.CarListActivity
import com.alkemy.meli.wave2.databinding.ActivityHomeBinding
import kotlin.reflect.KClass

class HomeActivity : Activity() {

	private lateinit var binding: ActivityHomeBinding


	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)

		binding = ActivityHomeBinding.inflate(layoutInflater)
		setContentView(binding.root)

		setupListeners()
	}


	private fun setupListeners() {
		binding.cardCar.setOnClickListener {
			dispatchTo(CarListActivity::class)
		}
	}

	private fun dispatchTo(activity: KClass<*>) {
		startActivity(Intent(this, activity.java))
	}
}
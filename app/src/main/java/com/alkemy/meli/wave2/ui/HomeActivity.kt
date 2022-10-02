package com.alkemy.meli.wave2.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.alkemy.meli.wave2.car.CarListActivity
import com.alkemy.meli.wave2.databinding.ActivityHomeBinding
import com.alkemy.meli.wave2.favorite.FavoriteListActivity
import com.alkemy.meli.wave2.moto.MotorcycleListActivity
import com.alkemy.meli.wave2.realstate.RealStateListActivity
import com.alkemy.meli.wave2.truck.TruckListActivity
import kotlin.reflect.KClass

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupListeners()
    }

    fun setupListeners() {
        binding.cardCar.setOnClickListener {
            dispatchTo(CarListActivity::class)
        }
        binding.cardMotorcycle.setOnClickListener {
            dispatchTo(MotorcycleListActivity::class)
        }
        binding.cardTruck.setOnClickListener {
            dispatchTo(TruckListActivity::class)
        }
        binding.cardProperty.setOnClickListener {
            dispatchTo(RealStateListActivity::class)
        }
        binding.cardFavorite.setOnClickListener {
            dispatchTo(FavoriteListActivity::class)
        }
    }

    private fun dispatchTo(activity: KClass<*>) {
        startActivity(Intent(this, activity.java))
    }
}
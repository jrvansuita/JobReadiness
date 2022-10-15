package com.alkemy.meli.wave2.car.service

import com.alkemy.meli.wave2.car.model.entities.Car
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface CarService {
	@GET("cars")
	fun findAll(): Call<List<Car>>

	@GET("cars/{id}")
	fun findOne(@Path("id") id: Int): Call<Car?>


}
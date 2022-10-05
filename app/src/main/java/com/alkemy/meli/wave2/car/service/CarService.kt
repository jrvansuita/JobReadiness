package com.alkemy.meli.wave2.car.service

import com.alkemy.meli.wave2.car.model.Car
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface CarService {
    @GET("cars")
    fun get(): Single<List<Car>>

    @GET("car")
    fun find(@Query("id") id: Int): Single<Car?>
}
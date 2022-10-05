package com.alkemy.meli.wave2.car.remote

import com.alkemy.meli.wave2.car.data.DataSource
import com.alkemy.meli.wave2.car.model.Car
import com.alkemy.meli.wave2.car.service.CarService

class CarRemoteDataSourceImpl(private val service: CarService) : DataSource<Car> {
    override fun findAll(): List<Car> = service.get().blockingGet()

    override fun findOne(id: Int) = service.find(id).blockingGet()
}
package com.alkemy.meli.wave2.car.repository

import com.alkemy.meli.wave2.car.data.DataSource
import com.alkemy.meli.wave2.car.model.entities.Car

class CarRepositoryImpl(private val dataSource: DataSource<Car>) : CarRepository {

    override fun findAll(): List<Car> = dataSource.findAll()

    override fun findOne(id: Int): Car? = dataSource.findOne(id)
}
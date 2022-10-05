package com.alkemy.meli.wave2.car.repository

import com.alkemy.meli.wave2.car.model.Car

interface CarRepository {
    fun findAll(): List<Car>
    fun findOne(id: Int): Car?
}
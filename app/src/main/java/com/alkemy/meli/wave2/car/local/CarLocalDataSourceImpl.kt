package com.alkemy.meli.wave2.car.local

import com.alkemy.meli.wave2.car.data.DataSource
import com.alkemy.meli.wave2.car.model.entities.Car
import com.alkemy.meli.wave2.mock.getMockedCars

class CarLocalDataSourceImpl : DataSource<Car> {

    override fun findAll(): List<Car> = getMockedCars()

    override fun findOne(id: Int): Car? {
        return getMockedCars().firstOrNull { it.id == id }
    }

}
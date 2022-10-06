package com.alkemy.meli.wave2.car.usecase

import com.alkemy.meli.wave2.car.model.entities.Car
import com.alkemy.meli.wave2.car.repository.CarRepository


class FindOneCarUseCaseImpl(private val repository: CarRepository) : FindOneUseCase<Int, Car> {
    override fun execute(key: Int) = repository.findOne(key)
}
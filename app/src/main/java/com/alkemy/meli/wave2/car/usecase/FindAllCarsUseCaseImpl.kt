package com.alkemy.meli.wave2.car.usecase

import com.alkemy.meli.wave2.car.model.entities.Car
import com.alkemy.meli.wave2.car.repository.CarRepository


class FindAllCarsUseCaseImpl(private val repository: CarRepository) : FindAllUseCase<Car> {
    override fun execute() = repository.findAll()
}
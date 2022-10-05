package com.alkemy.meli.wave2.car.usecase

interface FindAllUseCase<R> {
    fun execute(): List<R>
}

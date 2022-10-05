package com.alkemy.meli.wave2.car.usecase

interface FindOneUseCase<P, R> {
    fun execute(key: P): R?
}

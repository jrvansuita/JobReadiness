package com.alkemy.meli.wave2.car.data

interface DataSource<T> {
    fun findAll(): List<T>
    fun findOne(id: Int): T?
}
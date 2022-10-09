package com.alkemy.meli.wave2.car.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alkemy.meli.wave2.car.local.CarLocalDataSourceImpl
import com.alkemy.meli.wave2.car.model.entities.Car
import com.alkemy.meli.wave2.car.repository.CarRepositoryImpl
import com.alkemy.meli.wave2.car.usecase.FindAllCarsUseCaseImpl

class CarListViewModel : ViewModel() {

    //Usar via construtor, com viewmodelfactory em Dagger
    private val useCase by lazy {
        FindAllCarsUseCaseImpl(
            CarRepositoryImpl(
                CarLocalDataSourceImpl()
            )
        )
    }

    private val mutableList = MutableLiveData<List<Car>>()
    val list: LiveData<List<Car>> = mutableList

    fun load() {
        mutableList.postValue(useCase.execute())
    }

}


package com.alkemy.meli.wave2.car.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.alkemy.meli.wave2.car.usecase.FindAllCarsUseCaseImpl


class CarListViewModelFactory(private val useCase: FindAllCarsUseCaseImpl) :
    ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>) = CarListViewModel(/*useCase*/) as T
}


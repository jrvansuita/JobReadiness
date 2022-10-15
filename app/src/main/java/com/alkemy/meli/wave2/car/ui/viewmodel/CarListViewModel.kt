package com.alkemy.meli.wave2.car.ui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alkemy.meli.wave2.api.Api
import com.alkemy.meli.wave2.car.local.CarLocalDataSourceImpl
import com.alkemy.meli.wave2.car.model.entities.Car
import com.alkemy.meli.wave2.car.remote.CarRemoteDataSourceImpl
import com.alkemy.meli.wave2.car.repository.CarRepositoryImpl
import com.alkemy.meli.wave2.car.usecase.FindAllCarsUseCaseImpl
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CarListViewModel : ViewModel() {

	//Remote Data Source
	private val remoteDataSource = CarRemoteDataSourceImpl(Api.carService())

	//Local Data Source
	private val localDataSource = CarLocalDataSourceImpl()

	private val dataSource = remoteDataSource //localDataSource

	private val useCase by lazy {
		FindAllCarsUseCaseImpl(
			CarRepositoryImpl(dataSource)
		)
	}

	private val mutableList = MutableLiveData<List<Car>>()
	val list: LiveData<List<Car>> = mutableList

	fun load() {
		CoroutineScope(Dispatchers.IO).launch {
			val cars = useCase.execute()
			mutableList.postValue(cars)
		}
	}

}



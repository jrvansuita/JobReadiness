package com.alkemy.meli.wave2.car.ui.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alkemy.meli.wave2.api.Api
import com.alkemy.meli.wave2.car.checks.TextInputValidator
import com.alkemy.meli.wave2.car.local.CarLocalDataSourceImpl
import com.alkemy.meli.wave2.car.model.entities.Car
import com.alkemy.meli.wave2.car.remote.CarRemoteDataSourceImpl
import com.alkemy.meli.wave2.car.repository.CarRepositoryImpl
import com.alkemy.meli.wave2.car.usecase.FindOneCarUseCaseImpl
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CarDetailViewModel : ViewModel() {

	//Remote Data Source
	private val remoteDataSource = CarRemoteDataSourceImpl(Api.carService())

	//Local Data Source
	private val localDataSource = CarLocalDataSourceImpl()

	private val dataSource = localDataSource // remoteDataSource

	private val useCase by lazy {
		FindOneCarUseCaseImpl(
			CarRepositoryImpl(dataSource)
		)
	}

	private val mutableCar = MutableLiveData<Car?>()
	val car: LiveData<Car?> = mutableCar

	fun findCar(id: Int) {
		CoroutineScope(Dispatchers.IO).launch {
			Log.i("CarDetailViewModel", "findCar(carId=${id})")
			val car = useCase.execute(id)
			mutableCar.postValue(car)
		}
	}

	private val mutableAskResult = MutableLiveData<Result>()
	val ask: LiveData<Result> = mutableAskResult

	fun checkEditTextValue(text: String) {
		Log.i("text", text)

		val validator = TextInputValidator()

		val result = if (validator.hasPhone(text)) {
			ErrorTypes.Phone
		} else if (validator.hasEmail(text)) {
			ErrorTypes.Email
		} else if (text.isEmpty()) {
			ErrorTypes.Empty
		} else {
			null
		}

		result?.let {
			mutableAskResult.postValue(Result.Error(it))
		}
	}

	sealed class Result {
		object Success : Result()
		class Error(val type: ErrorTypes = ErrorTypes.Empty) : Result()
	}

	enum class ErrorTypes {
		Empty, Email, Phone
	}
}
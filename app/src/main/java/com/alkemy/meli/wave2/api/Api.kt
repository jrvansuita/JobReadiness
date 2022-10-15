package com.alkemy.meli.wave2.api

import com.alkemy.meli.wave2.BuildConfig
import com.alkemy.meli.wave2.car.service.CarService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class Api {

	companion object {

		private val api = Retrofit.Builder()
			.baseUrl(BuildConfig.API_URL)
			.addConverterFactory(GsonConverterFactory.create())
			.client(client())
			.build()


		private fun client() = OkHttpClient.Builder()
			.addInterceptor(logger())
			.build()

		private fun logger() = HttpLoggingInterceptor().apply {
			setLevel(HttpLoggingInterceptor.Level.BODY)
		}

		fun carService(): CarService {
			return api.create(CarService::class.java)
		}
	}
}
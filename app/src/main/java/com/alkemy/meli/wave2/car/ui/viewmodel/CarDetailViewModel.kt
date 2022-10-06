package com.alkemy.meli.wave2.car.ui.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.alkemy.meli.wave2.car.checks.AskChecks

class CarDetailViewModel : ViewModel() {

    private val mutableResult = MutableLiveData<Result>()
    val result: LiveData<Result> = mutableResult

    fun checkEditTextValue(text: String) {
        Log.i("text", text)

        if (AskChecks().checks(text)) {
            mutableResult.postValue(Result.Success)
        } else {
            mutableResult.value = Result.Error("Não foi validado")
        }

        //Or

        mutableResult.postValue(Result.Success.takeIf { AskChecks().checks(text) }
            ?: Result.Error("Não foi validado"))
    }

    sealed class Result {
        object Success : Result()
        class Error(val msg: String) : Result()
    }


}
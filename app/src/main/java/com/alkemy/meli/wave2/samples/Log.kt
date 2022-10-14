package com.alkemy.meli.wave2.samples

import android.util.Log
import com.alkemy.meli.wave2.BuildConfig


fun logs() {

	if (BuildConfig.DEBUG) {

	}

	//Error
	Log.e("TAG-ERROR", 5.toString())

	//Info
	Log.i("TAG-INFO", "TEXT")

	//Warning
	Log.w("TAG-WARN", "TEXT")

	//Verbose
	Log.v("TAG-VER", "TEXT")

	//Verbose
	Log.d("TAG-DEBUG", "TEXT")
}
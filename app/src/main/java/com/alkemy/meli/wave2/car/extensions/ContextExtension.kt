package com.alkemy.meli.wave2.car.extensions

import android.content.Context

fun Context.getStringComSeta(resource: Int): String {
    return "-> ${getString(resource)}"
}

fun Context.getTwoStrings(a: Int, b: Int): String {
    return "${getString(a)} -  ${getString(b)}"
}
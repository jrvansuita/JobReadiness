package com.alkemy.meli.wave2.car.checks

class TextInputValidator {

	companion object {
		private var EMAIL_PATTERN = Regex("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+")
		private var PHONE_PATTERN = Regex("[0-9]{5}")
	}

	fun hasPhone(text: String?) = text?.contains(PHONE_PATTERN) ?: false
	fun hasEmail(text: String?) = text?.contains(EMAIL_PATTERN) ?: false
}
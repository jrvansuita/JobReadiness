package com.alkemy.meli.wave2

import com.alkemy.meli.wave2.car.checks.TextInputValidator
import org.junit.Assert
import org.junit.Test


class TextInputValidatorUnitTest {

	@Test
	fun shouldResultsTrueWhenHasValidEmail() {
		//#1 - Given
		val someText = "jr@email.com"
		val validator = TextInputValidator()

		//#2 - When
		val hasEmail = validator.hasEmail(someText)

		//#3 - Then
		Assert.assertTrue(hasEmail)
	}

	@Test
	fun shouldResultsFalseWhenHasNotValidEmail() {
		//#1 - Given
		val someText = "jr####@email.com"
		val validator = TextInputValidator()

		//#2 - When
		val hasEmail = validator.hasEmail(someText)

		//#3 - Then
		Assert.assertFalse(hasEmail)
	}

	@Test
	fun shouldResultsFalseWhenHasEmptyText() {
		//#1 - Given
		val someText = ""
		val validator = TextInputValidator()

		//#2 - When
		val hasEmail = validator.hasEmail(someText)

		//#3 - Then
		Assert.assertFalse(hasEmail)
	}

	@Test
	fun shouldResultsFalseWhenHasNullString() {
		//#1 - Given
		val someText = null
		val validator = TextInputValidator()

		//#2 - When
		val hasEmail = validator.hasEmail(someText)

		//#3 - Then
		Assert.assertFalse(hasEmail)
	}
}
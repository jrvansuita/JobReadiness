package com.alkemy.meli.wave2

import com.alkemy.meli.wave2.car.checks.TextInputValidator
import org.junit.Assert
import org.junit.Test

class ValidatorUnitTest {

	@Test
	fun shouldValidateInputEmailValid() {
		// Given - Dado certo valor
		val email = "junior@gmail.com"

		// When - Executado certa funcão
		val hasEmail = TextInputValidator().hasEmail(email)

		// Then - O resultado esperado é validado
		Assert.assertTrue(hasEmail)
	}

	@Test
	fun shouldValidateInputEmailNotValid() {
		// Given - Dado certo valor
		val email = "jun ior@gm ail.com"

		// When - Executado certa funcão
		val hasEmail = TextInputValidator().hasEmail(email)

		// Then - O resultado esperado é validado
		Assert.assertFalse(hasEmail)
	}


	@Test
	fun shouldValidateInputEmailEmpty() {
		// Given - Dado certo valor
		val email = " "

		// When - Executado certa funcão
		val hasEmail = TextInputValidator().hasEmail(email)

		// Then - O resultado esperado é validado
		Assert.assertEquals(false, hasEmail)
	}

	@Test
	fun shouldValidateInputEmailNull() {
		// Given - Dado certo valor
		val email = null

		// When - Executado certa funcão
		val hasEmail = TextInputValidator().hasEmail(email)

		// Then - O resultado esperado é validado
		Assert.assertEquals(false, hasEmail)
	}


	// -------------------------- //

	@Test
	fun shouldValidateInputPhoneValid() {
		// Given - Dado certo valor
		val mensagem = "Meu telefone é 999765432. Me liga lá."

		// When - Executado certa funcão
		val hasPhone = TextInputValidator().hasPhone(mensagem)

		// Then - O resultado esperado é validado
		Assert.assertTrue(hasPhone)
	}

	@Test
	fun shouldValidateInputPhoneNotValid() {
		// Given - Dado certo valor
		val mensagem = "Meu telefone é 9. Me liga lá."

		// When - Executado certa funcão
		val hasPhone = TextInputValidator().hasPhone(mensagem)

		// Then - O resultado esperado é validado
		Assert.assertFalse(hasPhone)
	}

	@Test
	fun shouldValidateInputPhoneEmpty() {
		// Given - Dado certo valor
		val mensagem = ""

		// When - Executado certa funcão
		val hasPhone = TextInputValidator().hasPhone(mensagem)

		// Then - O resultado esperado é validado
		Assert.assertFalse(hasPhone)
	}

	@Test
	fun shouldValidateInputPhoneNull() {
		// Given - Dado certo valor
		val mensagem = null

		// When - Executado certa funcão
		val hasPhone = TextInputValidator().hasPhone(mensagem)

		// Then - O resultado esperado é validado
		Assert.assertFalse(hasPhone)
	}

}
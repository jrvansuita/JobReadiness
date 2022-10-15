package com.alkemy.meli.wave2

import android.content.Intent
import android.os.SystemClock
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.hasErrorText
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.alkemy.meli.wave2.car.ui.CarDetailActivity
import com.alkemy.meli.wave2.mock.getMockedCars
import org.hamcrest.CoreMatchers.containsString
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class CarDetailActivityInstrumentedTest {

	private lateinit var scenario: ActivityScenario<CarDetailActivity>

	@Before
	fun setup() {
		val carId = getMockedCars().first().id
		val intent =
			Intent(ApplicationProvider.getApplicationContext(), CarDetailActivity::class.java)
				.apply {
					putExtra("ID", carId)
				}

		scenario = ActivityScenario.launch(intent)
	}

	@Test
	fun checkActivityCanShowErrorWhenTypedAnEmail() {
		//Given
		val someInput = "My email is jr@email.com, contact me there."
		val theError = "Não é permitido escrever endereços de e-mail"

		//Wait
		SystemClock.sleep(500)

		//When

		//Ask the question
		onView(withId(R.id.ask_text_field))
			.perform(replaceText(someInput))
			.perform(closeSoftKeyboard())

		//Clicking on the car button
		onView(withId(R.id.button_question)).perform(click())

		//Wait
		SystemClock.sleep(1000)

		//Then
		//Checks the input error
		onView(withId(R.id.ask_text_field))
			.check(matches(hasErrorText(containsString(theError))))
	}

	@After
	fun cleanup() = scenario.close()

}
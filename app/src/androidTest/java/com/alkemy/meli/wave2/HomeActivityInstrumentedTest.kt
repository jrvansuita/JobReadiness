package com.alkemy.meli.wave2

import android.os.SystemClock
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.alkemy.meli.wave2.ui.HomeActivity
import org.hamcrest.CoreMatchers.containsString
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class HomeActivityInstrumentedTest {

	private lateinit var scenario: ActivityScenario<HomeActivity>

	@Before
	fun setup() {
		scenario = ActivityScenario.launch(HomeActivity::class.java)
	}

	@Test
	fun checkALotOfThings() {
		//Clicking on the car button
		onView(withId(R.id.card_car)).perform(ViewActions.click())

		//Wait
		SystemClock.sleep(500)
	}

	@Test
	fun checkIfFreeShippingIsShowing() {
		onView(withId(R.id.text_free_shipping_continued)).check(matches(withText(R.string.free_shipping_continued)))


	}

	@Test
	fun checkIfProductDescriptionIsShowing() {
		onView(withId(R.id.text_product_description))
			.check(matches(withText(containsString("Tenis Feminino Adidas Run Falcon 2.0 Original Preto"))))


	}

	@After
	fun cleanup() = scenario.close()

}
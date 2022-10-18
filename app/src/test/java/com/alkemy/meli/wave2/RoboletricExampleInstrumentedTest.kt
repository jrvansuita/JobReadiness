package com.alkemy.meli.wave2

import android.widget.TextView
import com.alkemy.meli.wave2.ui.HomeActivity
import org.junit.Assert
import org.junit.Assert.assertNotNull
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner


@RunWith(RobolectricTestRunner::class.java)
class RoboletricExampleInstrumentedTest {

	private lateinit var activity: HomeActivity

	@Before
	fun setup() {
		activity = Robolectric.setupActivity(HomeActivity::class.java)
	}

	@Test
	fun validateTextViewContent() {
		val tvHelloWorld = activity.findViewById<TextView>(R.id.ask_text_field)

		Assert.assertTrue()
		Assert.assertEquals()

		assertNotNull("TextView could not be found", tvHelloWorld)
		assertTrue(
			"TextView contains incorrect text",
			"Hello world!".equals(tvHelloWorld.text.toString())
		)
	}
}
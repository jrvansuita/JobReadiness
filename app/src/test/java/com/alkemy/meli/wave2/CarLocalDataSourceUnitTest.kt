package com.alkemy.meli.wave2

import com.alkemy.meli.wave2.car.local.CarLocalDataSourceImpl
import com.alkemy.meli.wave2.mock.getMockedCars
import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class CarLocalDataSourceUnitTest {

	private lateinit var dataSource: CarLocalDataSourceImpl

	@Before
	fun setup() {
		dataSource = CarLocalDataSourceImpl()
	}

	@Test
	fun shouldResultsTheMockedList() {
		//#1 - Given
		val mockedList = getMockedCars()

		//#2 - When
		val list = dataSource.findAll()

		//#3 - Then
		Assert.assertTrue(list.isNotEmpty())
		Assert.assertEquals(list, mockedList)
		Assert.assertEquals(list.first(), mockedList.first())
		Assert.assertTrue(list.first().name == mockedList.first().name)
	}

	@Test
	fun shouldResultsTheMockedListFindOne() {
		//#1 - Given
		val mockedList = getMockedCars()
		val id = 3

		//#2 - When
		val car = dataSource.findOne(id)

		//#3 - Then
		Assert.assertEquals(mockedList.first { it.id == 3 }, car)
	}

	@Test
	fun MaisUm() {
		//dataSource
	}


	@Test
	fun Outra() {
		//dataSource
	}

	@After
	fun final() {

	}


}
package com.wcc.supertrunfo.interactors

import com.wcc.supertrunfo.data.SuperTrunfoDatabase
import com.wcc.supertrunfo.entities.Driver
import com.wcc.supertrunfo.entities.Vehicle

class CardsInteractor {
    private val database = SuperTrunfoDatabase()
    val cardOne: Card = generateCard()
    val cardTwo: Card = generateCard()

    private fun generateCard(): Card {
        val driver: Driver = database.getAllDrivers().random()
        val vehicle: Vehicle = database.getAllVehicles().random()

        return Card(vehicle, driver)
    }

}
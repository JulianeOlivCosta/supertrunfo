package com.wcc.supertrunfo

class Card(
    private val vehicle: Vehicle,
    private val driver: Driver,
    private val player: Player
) {
    val label: String = "Card ${player.name}"
    val maxVelocity = initMaxVelocity()
    val accelerationTime = setAccelerationTime()
    val passengers = initPassengers()
    val xp = initXP()

    private fun setAccelerationTime(): Int{
        return 0
    }

    private fun initXP(): Int {
        return when (vehicle.type) {
            "car" -> driver.carXP
            "motorcycle" -> driver.motorcycleXP
            else -> driver.bikeXP
        }
    }

    private fun initPassengers(): Int {
        return vehicle.passengers * (1 + driver.defensiveDriving)
    }

    private fun initMaxVelocity (): Int {
        return when (vehicle.type){
            "car" -> carMaxVelocity()//contas quando o tipo for car
            "motorcycle" -> motorcycleMaxVelocity() // contas quando for moto
            else -> bikeMaxVelocity() //contas quando for a magrela

        }
    }

    private fun bikeMaxVelocity(): Int {
        return vehicle.maxAcceleration * driver.boldness
    }

    private fun motorcycleMaxVelocity(): Int {
        return 1 / vehicle.weight * vehicle.maxAcceleration

    }

    private fun carMaxVelocity(): Int {
        return if (vehicle.styles == "sedã"){
            vehicle.maxAcceleration
        }else {
            vehicle.maxAcceleration + 10
        }
    }
}
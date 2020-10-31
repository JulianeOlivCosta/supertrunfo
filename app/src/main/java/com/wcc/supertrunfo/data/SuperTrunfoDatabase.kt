package com.wcc.supertrunfo.data

import com.wcc.supertrunfo.entities.Driver
import com.wcc.supertrunfo.entities.Vehicle

class SuperTrunfoDatabase {
     fun getAllVehicles(): List<Vehicle>{

         val vehicleOne = Vehicle(
                 100,
                 120,
                 5,
                 120,
                 2,
                 "sedã",
                 5,
                 "car")

         val vehicleTwo = Vehicle(
                 50,
                 60,
                 2,
                 10,
                 0,
                 "regular",
                 7,
                 "bike"
         )

         val vehicleThree = Vehicle(
                 170,
                 40,
                 2,
                 70,
                 0,
                 "adventure",
                 6,
                 "motorcycle"
         )

         val vehicleFour = Vehicle(
                 130,
                 170,
                 4,
                 110,
                 2,
                 "hatch",
                 5,
                 "car"
         )

         val vehicleFive = Vehicle(
                 30,
                 240,
                 1,
                 13,
                 0,
                 "regular",
                 4,
                 "bike"
         )


         val vehiculeOne = mapOf(
                 "maxAcceleration" to "100",
                 "accelerationTime" to "120",
                 "passengers" to "5",
                 "weight" to "120",
                 "doors" to "2",
                 "style" to "sedã",
                 "gears" to "5",
                 "type" to "car"
         )

         val vehiculeTwo = mapOf(
                 "maxAcceleration" to "50",
                 "accelerationTime" to "60",
                 "passengers" to "2",
                 "weight" to "10",
                 "doors" to "0",
                 "style" to "regular",
                 "gears" to "7",
                 "type" to "bicke"
         )

         val vehiculeThree = mapOf(
                 "maxAcceleration" to "170",
                 "accelerationTime" to "40",
                 "passengers" to "2",
                 "weight" to "70",
                 "doors" to "0",
                 "style" to "adventure",
                 "gears" to "6",
                 "type" to "motorcycle"
         )

         val vehiculeFour = mapOf(
                 "maxAcceleration" to "130",
                 "accelerationTime" to "170",
                 "passengers" to "4",
                 "weight" to "110",
                 "doors" to "2",
                 "style" to "hatch",
                 "gears" to "5",
                 "type" to "car"
         )


         val vehiculeFive = mapOf(
                 "maxAcceleration" to "30",
                 "accelerationTime" to "240",
                 "passengers" to "1",
                 "weight" to "13",
                 "doors" to "0",
                 "style" to "regular",
                 "gears" to "4",
                 "type" to "bike"
         )

         return listOf(vehicleOne,vehicleTwo,vehicleThree,vehicleFour,vehicleFive)

     }

     fun getAllDrivers(): List<Driver>{

         val DriverOne = Driver(
                 40,
                 60,
                 10,
                 2,
                 10,
                 0,
                 3,
                 4
         )
         val DriverTwo = Driver(
                 90,
                 10,
                 30,
                 30,
                 0,
                 0,
                 2,
                 7
         )
         val DriverThree = Driver(
                 50,
                 30,
                 80,
                 3,
                 7,
                 15,
                 6,
                 2
         )


         val driverOne = mapOf(
                 "carXP" to "40",
                 "bikeXP" to "60",
                 "motorcycleXP" to "10",
                 "carChampionships" to "2",
                 "bikeChampionships" to "10",
                 "motorcycleChampionships" to "0",
                 "boldness" to "3",
                 "defensiveDriving" to "4",
         )

         val driverTwo = mapOf(
                 "carXP" to "90",
                 "bikeXP" to "10",
                 "motorcycleXP" to "30",
                 "carChampionships" to "30",
                 "bikeChampionships" to "0",
                 "motorcycleChampionships" to "0",
                 "boldness" to "2",
                 "defensiveDriving" to "7",
         )

         val driverThree = mapOf(
                 "carXP" to "50",
                 "bikeXP" to "30",
                 "motorcycleXP" to "80",
                 "carChampionships" to "3",
                 "bikeChampionships" to "7",
                 "motorcycleChampionships" to "15",
                 "boldness" to "6",
                 "defensiveDriving" to "2",
         )
         return listOf(DriverOne,DriverTwo,DriverThree)
     }

}
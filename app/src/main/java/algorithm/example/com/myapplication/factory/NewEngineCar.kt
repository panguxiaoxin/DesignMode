package algorithm.example.com.myapplication.factory

import algorithm.example.com.myapplication.factory.Car

class NewEngineCar : Car {
    override fun getEngine(): String {
        return "newEngineCar"
    }
}
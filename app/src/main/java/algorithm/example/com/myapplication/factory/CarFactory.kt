package algorithm.example.com.myapplication.factory

abstract class CarFactory {
    abstract  fun<T:Car> product(item:Class<T>):T
}
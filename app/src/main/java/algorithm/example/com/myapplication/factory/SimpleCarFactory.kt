package algorithm.example.com.myapplication.factory

class SimpleCarFactory {

    fun product( type:String): Car {
        when (type){
            "tran"->return TrandationalCar()
            "new"->return NewEngineCar();
            else-> return TrandationalCar()
        }

    }
}
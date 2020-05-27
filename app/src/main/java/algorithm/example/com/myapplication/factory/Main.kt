package algorithm.example.com.myapplication.factory

class Main {

    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            // 简单工厂模式
            var factory=
                SimpleCarFactory();
            println(factory.product("tra").getEngine())
            println(factory.product("new").getEngine())
            println(factory.product("11").getEngine())
            //工厂方法

           var methofactory=MethodCarFactory();
           println( methofactory.product(TrandationalCar::class.java).getEngine())
        }
    }
}
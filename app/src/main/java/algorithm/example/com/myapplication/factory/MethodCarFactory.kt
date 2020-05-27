package algorithm.example.com.myapplication.factory

class MethodCarFactory :CarFactory(){
    override fun <T : Car> product(item: Class<T>): T {
        var car:Car;
        return item.newInstance()

    }
}
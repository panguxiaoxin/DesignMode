package algorithm.example.com.myapplication.proxy
/*
*  代理类
* */
class Purchaging(var iShop:IShop) :IShop {

    override fun buy() {
        iShop .buy()
    }
}
package algorithm.example.com.myapplication.proxy

import java.lang.reflect.Proxy

class Main {

    companion object{

        @JvmStatic
        fun main(args:Array<String>){
            //静态代理
            var js:JsonChao= JsonChao();
            var p: Purchaging= Purchaging(js)
            p.buy()
            // 动态代理

           var dp=DynamicPurchasing(js)

            var ishop: IShop =Proxy.newProxyInstance(js.javaClass.classLoader, arrayOf(IShop::class.java),dp) as IShop
            ishop.buy()
        }
    }
}
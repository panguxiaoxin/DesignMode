package algorithm.example.com.myapplication.builder

import algorithm.example.com.myapplication.proxy.DynamicPurchasing
import algorithm.example.com.myapplication.proxy.IShop
import algorithm.example.com.myapplication.proxy.JsonChao
import algorithm.example.com.myapplication.proxy.Purchaging
import java.lang.reflect.Proxy

class Main {

    companion object{

        @JvmStatic
        fun main(args:Array<String>){

          println(User.builder().setAge(12).setUserName("小明").build().toString())
        }
    }
}
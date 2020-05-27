package algorithm.example.com.myapplication.observer

import algorithm.example.com.myapplication.proxy.DynamicPurchasing
import algorithm.example.com.myapplication.proxy.IShop
import algorithm.example.com.myapplication.proxy.JsonChao
import algorithm.example.com.myapplication.proxy.Purchaging
import java.lang.reflect.Proxy

class Main {
    companion object{

        @JvmStatic
        fun main(args:Array<String>){
            var student=Student();
            student.setChangeAction {
                println(student.name)
            }
            student.name="xiaohong"
        }
    }
}
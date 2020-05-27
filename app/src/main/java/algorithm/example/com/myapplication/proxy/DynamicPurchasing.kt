package algorithm.example.com.myapplication.proxy

import java.lang.reflect.InvocationHandler
import java.lang.reflect.Method

class DynamicPurchasing(var o:Any) :InvocationHandler {


    override fun invoke(proxy: Any?, method: Method?, args: Array<out Any>?): Any? {
       return method?.invoke(o,*args.orEmpty());
    }
}
package algorithm.example.com.myapplication.observer

import org.jetbrains.annotations.TestOnly

class Student {

    var name:String=""
     set(value){
         field=value;
         onChangeAction?.invoke(this)
     }
    var age:Int=0
       set(value){
           field=value;
           onChangeAction?.invoke(this)
    }

   private var onChangeAction:((Student)->Unit)?=null


    fun setChangeAction(action:(student:Student) -> Unit):Student{
        this.onChangeAction = action
        return this
    }


}
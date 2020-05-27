package algorithm.example.com.myapplication.builder

class User private constructor(){
    private  lateinit var firstName:String
    private  lateinit var lastName:String
    private   var   age:Int=0;
    private lateinit var name:String
    private lateinit var sex :String

       companion object{
           fun builder():Builder{
               return Builder()
           }
       }
    class Builder{
       private var user=User();
        fun setUserName(name:String):Builder{
            user.name=name;
            return this
        }

        fun setAge(age:Int):Builder{
            user.age=age
            return this
        }

        fun build():User{
            return user;
        }

    }

    override fun toString(): String {
        return "User(firstName='$firstName', lastName='$lastName', age=$age, name='$name', sex='$sex')"
    }


}
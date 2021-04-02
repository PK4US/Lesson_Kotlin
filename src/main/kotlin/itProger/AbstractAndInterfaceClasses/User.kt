package itProger.AbstractAndInterfaceClasses

class User(var firstName:String = "Peter",var secondName:String= "Patrik"){

    fun printUser(){
        println("$firstName $secondName")
    }
}
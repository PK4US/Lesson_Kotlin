package Devcolibri.Lesson_12_The_open_modifier_and_its_scope.openexam

open class Person(val name:String){

    open val age:Int = 0

    open fun getAdress():String{
        return "Test"
    }

    override fun toString(): String {
        return "Person(name='$name'"
    }
}
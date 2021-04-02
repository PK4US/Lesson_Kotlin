package Devcolibri.Lesson_11_Abstract_classes_and_the_open_modifier.abstracs

open abstract class BaseTemplate {

    var count:Int = 0

    fun a1 (){
        count++
        println("Count: $count")
    }

    abstract fun minus()
}
package Devcolibri.Lesson_8_Enumerations_and_their_role

fun main(args:Array<String>) {

    println("#5545454")
    println("Red")
    println("Black")
    println("Green")

    var message:Colors = Colors.black
    var message2:String = Colors.black.name

    println(Colors.black)
    println(Colors.red.colorHex)
    println(Colors.orange.something())
}
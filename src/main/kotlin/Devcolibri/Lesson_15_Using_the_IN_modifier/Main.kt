package Devcolibri.Lesson_15_Using_the_IN_modifier

fun main(args:Array<String>) {
    val nums = 1..10
    val value = 3
    val characters = 'a'..'z'

//    for (num in nums){
//        if (num == value){
//            println(true)
//            break
//        }
//    }

    println(value in nums)

    fun isChar(char:Char,characters:CharRange) = char in characters

    println(isChar('i', characters))
}
package Devcolibri.Lesson_2_Variables_var_and_val

fun main(args:Array<String>){
    val userJava = UserJava("jackst99@mail.ru")
    val userKotlin = UserKotlin("Stepanchuk.ei@gmail.com")

    println("Java: ${userJava.email}")
    println("Kotlin: ${userKotlin.email}")
}
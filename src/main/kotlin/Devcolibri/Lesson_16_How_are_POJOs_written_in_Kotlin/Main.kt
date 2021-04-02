package Devcolibri.Lesson_16_How_are_POJOs_written_in_Kotlin

fun main(args:Array<String>) {
    val person = Person("Alex", 21)

    val person2 = person.copy(age = 1)

    person.age = 12

    println(person)
    println(person2)

    var (age) = person
    println("My age = $age")
}
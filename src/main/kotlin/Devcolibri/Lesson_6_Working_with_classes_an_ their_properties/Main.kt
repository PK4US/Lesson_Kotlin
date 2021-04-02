package Devcolibri.`Lesson_6_Working_with_classes_an_ their_properties`

fun main(args:Array<String>){
    val person = Person("Jack","Denial",74)

    println(person.firstName)
    println(person.lastName)
    println(person.age)

    val car = Car (25.5,30)
    println(car.isNew)

    car.isNew=true
}

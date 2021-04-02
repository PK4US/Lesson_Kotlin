package Devcolibri.Lesson_11_Abstract_classes_and_the_open_modifier.abstracs

import Devcolibri.Lesson_12_The_open_modifier_and_its_scope.openexam.Driver
import Devcolibri.Lesson_12_The_open_modifier_and_its_scope.openexam.Person

fun main(args:Array<String>) {
    val person = Person("Alex")
    println(person)

    val driver = Driver("Alex")
    println(driver)

    println(person.getAdress())
    println(driver.getAdress())
}
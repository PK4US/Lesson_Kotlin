package Devcolibri.Lesson_10_Interfaces

import Devcolibri.Lesson_10_Interfaces.interfaces.A
import Devcolibri.Lesson_10_Interfaces.interfaces.B
import Devcolibri.Lesson_10_Interfaces.interfaces.MyInterface

fun main(args:Array<String>) {

    var v1:MyInterface = A()
    var v2:MyInterface = B()

    v1.fun1()
    v2.fun1()
}
package Devcolibri.Lesson_9_Selection_operator

import Devcolibri.Lesson_9_Selection_operator.Colors.*

fun main(args:Array<String>) {
    println(getColor(white))
}

fun getColor (color:Colors) = when(color){
    black,white -> "Белый или черный"
    green -> "Зеленый"
    yellow ->"Желтый"
    orange ->"Оранжевый"
    red -> "Крассный"
    else -> "Без цвета"
}
package Devcolibri.Lesson_13_Access_modifiers

internal class SuperMouse: Mouse() {
    fun funD(){
        println("superMouse funD")
        funC()
    }
}
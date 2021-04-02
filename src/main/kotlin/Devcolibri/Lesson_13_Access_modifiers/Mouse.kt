package Devcolibri.Lesson_13_Access_modifiers

open class Mouse {
    public fun funA(){
        println("Hello public")
    }

    private fun funB(){
        println("Hello private")
    }

    protected fun funC(){
        println("Hello protected")
    }
}
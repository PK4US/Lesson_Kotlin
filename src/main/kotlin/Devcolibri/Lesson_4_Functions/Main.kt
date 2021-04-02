package Devcolibri.Lesson_4_Functions

fun main(args:Array<String>) {
    myFirstFunction()
    myFirstFunction2(1)
    myFirstFunction3()
    println(myFirstFunction4(5,4.4))

}

fun myFirstFunction():Int{
return 1
}

fun myFirstFunction2(a:Long):Int{
    return a.toInt()
}

fun myFirstFunction3(){

}

fun myFirstFunction4(a:Long,b:Double)=a+b
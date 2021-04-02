package Devcolibri.Lesson_14_Coolness_and_flexibility_of_cycles

fun main(args:Array<String>) {
    var index:Int = 0

//    while (index<10){
//        print("Йоу ")
//        index++
//    }

//    do {
//        print("Йоу ")
//        index++
//    }while (index<10)

    var nums = 1..10

//    for (value in nums){
//        print("$value ")
//    }

//    for (value in nums step 2){
//        print("$value ")
//    }

//    for (value in 10 downTo 1 ){
//        print("$value ")
//    }

    for (value in 10 downTo 1 step 2){
        print("$value ")
    }
}
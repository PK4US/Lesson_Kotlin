package itProger.FunctionParameters

fun printSome(item:String="Hi", vararg word: Any){
    print("$item:")
    word.forEach { el -> print("$el ") }
    println("")
}

fun main(args:Array<String>){
    var name = arrayOf("Veronika", "Ann","Yana","Aliona",1,true)
    printSome("Hello")
    printSome("Hello", "Bob")
    printSome(word = *arrayOf("Hello"), item = "World")
    printSome("Hello","World", 1)
    printSome("Hello","World", 1, true)
    printSome("Hello","World", 1, true,'t')
    printSome("Hello",*name)
}

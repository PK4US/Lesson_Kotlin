package itProger.Сycle

fun main(args:Array<String>){
    var items = 5

    while (items>0){
        println(items)
        items--
    }

    do {
        println("items: $items")
    }while (items ==5)

    for (i in 0..30 step 2){
        println(i)
    }

    for (i in 30 downTo 0 step 2){
        println(i)
    }


    for (i in 30 downTo 0 step 2){
        println(i)
    }

    for (el in 'a'..'z')
        print(el)

    println()

    for (el in 'z' downTo 'a')
        print(el)

    println()

    val x = 20
    if (x in 5..30){
        println("Varible: $x")
    }
}
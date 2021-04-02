import javax.swing.JCheckBoxMenuItem

fun main(args:Array<String>){

    var items:Array<Int> = arrayOf(21,22,23,24,25)
    println(items[0])
    items.forEach { el ->
        println(el) }
    items.forEachIndexed { index, el ->
        println("$el с индексом $index") }

    var item_list:List<Int> = listOf(31,32,33,34,35)
    println(item_list.get(0))

    val someArray = arrayOf("ff",25,true)
    for (el in someArray){
        println(el) }

    var user = mutableMapOf("name" to "Bob", "age" to "1","isHasCar" to true)
    user.forEach{key,value ->println("$key -> $value")}
    user.put("city", "NewYork")
    user.forEach{key,value ->println("$key -> $value")}


    var item = mutableListOf<Any>(31,32,33,34,35)
    item.add(true)
    item.forEach{el ->
        println(el)
    }
}
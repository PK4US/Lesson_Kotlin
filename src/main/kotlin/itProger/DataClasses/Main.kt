package itProger.DataClasses

class Some {
    companion object {
        var count = 0
    }

    init {
        count++
        println("Создано $count обьектов")
    }
}
fun filterList(list:List<String>,filter:(String)->Boolean){
    list.forEach{el->
        if (filter(el))
            println(el)
    }
}

fun main(args:Array<String>){
    val test1 = Some()
    val test2 = Some()
    val test3 = Some()
    val test4 = Some()
    val test5 = Some()
    val test6 = Some()

    val db = Db.MongDb(1,"mongo")
    val db2 = Db.PostgreSQL(1,"mongo",true)

    val db_copy = db.copy(conn = "Done")

    if (db == db_copy){
        println("Обьекты одинаковые")
    }else{
        println("Они не одинаковые")
    }

    if (db is Db.MongDb){
        db.printInfo()
    }

    if (db_copy is Db.MongDb){
        db_copy.printInfo()
    }

    println("")

    val filter:(String)->Boolean={
        it.startsWith("J")
    }

    val list = listOf("Java","PHP","Ruby","C++","JavaScript")
    filterList(list,filter)
}
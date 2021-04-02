package itProger.DataClasses

sealed class Db{
    data class MySQL(val id:Int, val conn:String) : Db()
    data class MongDb(val id:Int, val conn:String) : Db()
    data class PostgreSQL(val id:Int, val conn:String, val isDone:Boolean) : Db()

    object Help:Db(){
        val conn= "Connection done"
    }
}

val Db.MongDb.info: String
    get() = "MongoDb has id: $id, connection: $conn "

fun Db.MongDb.printInfo(){
    println(info)
}
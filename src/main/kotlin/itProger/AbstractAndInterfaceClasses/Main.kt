package itProger.AbstractAndInterfaceClasses

fun main(args:Array<String>){
    val user = MainProvider()
    user.printInfo(User())
    println(user.getConnection())
    CheckDataTypes(user)
}

fun CheckDataTypes(obj:MainProvider){
    if (obj is UserInfoProvider){
        obj.printInfo(User())
    }

    if (obj is DbConnection){
        println(obj.getConnection())
    }
}
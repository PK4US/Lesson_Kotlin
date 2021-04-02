package itProger.AbstractAndInterfaceClasses

interface UserInfoProvider {
    val info:String
    fun printInfo(user: User) {
        println(info)
        user.printUser()
    }
}

interface DbConnection {
    fun getConnection ():String
}

class MainProvider:UserInfoProvider,DbConnection{
    override val info: String
        get() = "Переменная в интерфейсе"

    override fun printInfo(user: User) {
        super.printInfo(user)
        println("Дополнительный код")
    }

    override fun getConnection(): String {
        return "Db Connected"
    }
}
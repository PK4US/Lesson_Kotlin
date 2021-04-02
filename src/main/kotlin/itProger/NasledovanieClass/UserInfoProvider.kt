package itProger.NasledovanieClass

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

open class MainProvider:UserInfoProvider,DbConnection{
    protected open val db:String = "DB connected"

    override val info: String
        get() = "Переменная в интерфейсе"

    override fun printInfo(user: User) {
        super.printInfo(user)
        println("Дополнительный код")
    }

    override fun getConnection(): String {
        return db
    }
}
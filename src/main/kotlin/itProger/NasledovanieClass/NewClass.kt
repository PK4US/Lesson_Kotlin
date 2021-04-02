package itProger.NasledovanieClass

class NewClass: MainProvider() {
    override val info: String
        get() = "Новый метод из класса наследника"

    override fun printInfo(user: User) {
        super.printInfo(user)
        println("Выводиться текст из класса наследника!")
    }

    override val db: String
        get() = "db connected через класс"

}
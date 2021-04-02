package itProger.NasledovanieClass

enum class Animals{
    CAT, DOG, PARROT, LION;

    fun toLowerCase() = name.toLowerCase().capitalize()
}

fun main(args:Array<String>){
    val user = object:MainProvider(){
        override fun printInfo(user: User) {
            println("Выводиться текст из класса наследника")
        }
    }
    CheckDataTypes(user)

    val animal = Animals.PARROT
    when(animal){
        Animals.CAT -> println("Кошка")
        Animals.DOG -> println("Собака")
        Animals.PARROT -> println(animal.toLowerCase())
        Animals.LION -> println("Лев")
        else -> println("Другое животное")
    }
}

fun CheckDataTypes(obj:MainProvider){
    if (obj is UserInfoProvider){
        obj.printInfo(User())
    }

    if (obj is DbConnection){
        println(obj.getConnection())
    }
}
package itProger.Classes

fun main(args:Array<String>){

    val alex = User("Alex","Marley")
    println(alex.firstName+alex.secondName)

    val Jane = User("Jane", "Stepanchuk")
    println(Jane.firstName + " " + Jane.secondName)

    val Peter = User()
    println(Peter.firstName+Peter.secondName)

    val Bob = User("Bob" , "Bobaaa")
    println(Bob.firstName+Bob.secondName)

    val Naoborot = User(firstName = "famailiya")
    println(Naoborot.firstName  + Naoborot.secondName)

    alex.login = "codi@gmail.com"
    println(alex.login)
    alex.login

    println(Bob.login)
}
package itProger.Classes

class User(var firstName:String = "Peter",var secondName:String= "Patrik"){

    internal var login: String? =null

    set(value){
        if (value=="codi@gmail.com")
            field="None"
        else
            field=value
        println("Значение переменной: $field")
    }

    get (){
        val loginField= field?:"Неизвестно"
        println("Переменная равна: $loginField")
        return field
    }
}
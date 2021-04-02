package Devcolibri.Lesson_8_Enumerations_and_their_role

enum class Colors(val colorHex:String, val opecity:Double? = 1.0) {
    white("#FF049583"),
    black("#FFFFFFF"),
    green("#474783",0.5),
    yellow("#457503"),
    orange("#12224583",0.7),
    red("#F09849583");

    fun something(){
        println("my logic")
    }
}
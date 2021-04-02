package Devcolibri.Lesson_5_NPE_Null_Safety

fun main(args:Array<String>) {
    val st:String = ""
    val size = st.length
    println(size)

    val str:String? = getSt()
    val sizeStr = str!!.length
    println(sizeStr)
}

fun getSt():String?{
    return ""
}
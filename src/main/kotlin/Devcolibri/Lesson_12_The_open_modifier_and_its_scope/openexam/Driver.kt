package Devcolibri.Lesson_12_The_open_modifier_and_its_scope.openexam

class Driver(name: String) :Person(name) {

    override val age: Int = 2

    override fun getAdress(): String {
        return "Test2"
    }

    override fun toString(): String {
        return "Driver(age=$age,name=$name)"
    }


}
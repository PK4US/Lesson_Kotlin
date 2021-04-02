package Devcolibri.Lesson_17_Sealed_Classes

sealed class Expr {
    class Const (val number:Double):Expr()
    class Sum(val e1: Expr, val e2: Expr):Expr()
    object NotNumber:Expr()
}
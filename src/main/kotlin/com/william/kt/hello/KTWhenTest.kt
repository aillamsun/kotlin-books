package com.william.kt.hello

/**
 * Created by sungang on 2017/11/9.
 */


fun getMnemonic(color: Color) =
        when (color) {
            Color.RED -> "Richard"
            Color.ORANGE -> "Of"
            Color.YELLOW -> "York"
            Color.GREEN -> "Gave"
            Color.BLUE -> "Battle"
            Color.INDIGO -> "In"
            Color.VIOLET -> "Vain"
        }


fun getWarmth(color: Color) = when (color) {
    Color.RED, Color.ORANGE, Color.YELLOW -> "Warm"
    Color.GREEN -> "neutral"
    Color.INDIGO, Color.BLUE, Color.VIOLET -> "cold"
}


fun mix(c1: Color, c2: Color) =
        when (setOf(c1, c2)) {
            setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
            setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
            setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
            else -> throw Exception("Dirty Color")
        }


interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun evel(e: Expr): Int {
    if (e is Num) {
        val n = e as Num
        return n.value
    }
    if (e is Sum) {
        return evel(e.right) + evel(e.left)
    }

    throw IllegalArgumentException("Unknown expression")
}





fun main(args: Array<String>) {
//    println(getMnemonic(Color.BLUE))
//    println(getWarmth(Color.BLUE))
//    println(mix(Color.YELLOW, Color.RED))

    println(evel(Sum(Sum(Num(1), Num(2)), Num(4))))
}
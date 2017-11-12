package com.william.kt.hello

/**
 * Created by sungang on 2017/11/9.
 */


fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It’s a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a lettert"
    else -> "I don’t know..."
}

fun main(args: Array<String>) {
    println(isLetter('a'))
    println(isNotDigit('a'))
    println(recognize('a'))

    println("Kotlin" in "Java".."Kotlin")
}
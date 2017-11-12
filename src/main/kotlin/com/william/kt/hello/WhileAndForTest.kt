package com.william.kt.hello

/**
 * Created by sungang on 2017/11/9.
 */


fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz"
    i % 3 == 0 -> "Fizz"
    i % 5 == 0 -> "Buzz"
    else -> "$i"
}

fun forFizzBuzz() {
    for (i in 1..100) {
        println(fizzBuzz(i))
    }
}

/**
 *  步长区间循环
 */
fun forStepFizzBuzz() {
    for (i in 100 downTo 1 step 2) {
        println(fizzBuzz(i))
    }
}

fun main(args: Array<String>) {
//    forFizzBuzz()
    forStepFizzBuzz()
}
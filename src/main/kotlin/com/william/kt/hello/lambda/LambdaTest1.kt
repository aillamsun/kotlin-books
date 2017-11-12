package com.william.kt.hello.lambda

/**
 * Created by sungang on 2017/11/9.
 */

val sum = { x : Int , y : Int -> x + y}

fun main(args: Array<String>) {
    println(sum(1,2))
}
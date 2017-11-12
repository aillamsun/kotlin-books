package com.william.kt.hello.lambda

/**
 * Created by sungang on 2017/11/10.
 */


fun t1() {
    val items = listOf<String>("apple", "orange", "kiwi")
    var it: String

    items.filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
}


fun main(args: Array<String>) {
    t1()
}
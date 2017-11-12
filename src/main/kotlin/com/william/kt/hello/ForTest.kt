package com.william.kt.hello

/**
 * Created by sungang on 2017/11/10.
 */

fun main(args: Array<String>) {


    val items = listOf<String>("apple", "orange", "kiwi")

    // 1
    for (item in items)
        println(item)

    // 2
    for (index in items.indices)
        println("item at $index is ${items[index]}")

    // 3
    for( (i , e ) in items.withIndex())
        println("item at $i is $e}")
}
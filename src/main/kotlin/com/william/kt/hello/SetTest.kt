package com.william.kt.hello

/**
 * Created by sungang on 2017/11/9.
 */


fun forSet() {
    val set = hashSetOf("10", "20", "30")
    set.add("40")
    set.add("40")
    for ((i, e) in set.withIndex()) {
        println("$i : $e")
    }
}

fun main(args: Array<String>) {
    forSet()
    val muns = setOf(1,2,3)
    println(muns.max())
    println(muns)//触发 toString 方法
}
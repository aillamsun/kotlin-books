package com.william.kt.day1

/**
 *
 * 给多个变量同时赋值 分二元(Pair) 和 三元(Triple)
 *
 * Created by sungang on 2017/11/10.
 */


fun main(args: Array<String>) {

    //三元(Triple)
    val (day, method, course) = Triple(3, "学会", "Kotlin")
    val (desc, desc2) = Pair("很累", "但很充实!")


    var triple = Triple(3, "学会", "Kotlin")
    var pair = Pair("很累", "但很充实!")


    println("${day}天${method}${course},${desc},${desc2}")
    println("${triple.first}天${triple.second}${triple.third},${pair.first},${pair.second}")
}
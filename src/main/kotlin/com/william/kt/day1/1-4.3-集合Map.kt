package com.william.kt.day1

/**
 *
 * 集合类型:Map
 *
 * 无序可重复 类似于字典概念 不可变
 *
 * key value
 *
 * Created by sungang on 2017/11/10.
 */
fun main(args: Array<String>) {
    //定义一个map 使用元组 形式
    var ariPorts = mapOf<String, String>(Pair("1", "One"), Pair("2", "Two"), Pair("3", "Three"))
    //
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
    println(map.javaClass)
    println(ariPorts.javaClass)

    //元素计数size 是否为空isEmpty()
    println("ariPorts SIZE():${ariPorts.size}")
    println("ariPorts 是否为空():${ariPorts.isEmpty()}")


    //获取单个key 对应的value ： get()
    println(ariPorts.get("1"))
    println(ariPorts["1"])

    //所有key 对应的value
    for (v in ariPorts.values) {
        println(v)
    }
    for ((k, v) in ariPorts) {
        println("$k -> $v")
    }

    // 可变
//    ariPorts.toMutableMap();
//    ariPorts["1"] = "第一个元素"

    // remove removeAll
}
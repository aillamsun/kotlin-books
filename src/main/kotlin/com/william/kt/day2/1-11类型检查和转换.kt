package com.william.kt.day2

/**
 * 检查:对一个变量的类型进行辨别
 * 转换:把变量转换成其他类型
 *
 * Created by sungang on 2017/11/12.
 */

fun main(args: Array<String>) {

    val a = 5
    val b = 6

    val c = if (a > b) "大于" else a - b

    //类型判断:检查
    if (c is String) println("String 长度:${c.length}")

    if (c !is String) println("整数:${c}")


    //Kotlin 编译器大多数智能转换
    if (c is Int) println(c.inc())

    //手动转换：强制转换 as ，安全转换 as? 如果转换失败 就会异常
//    val d = c as String
//    println("d是c强制转换后的值:${d}")

    //安全转换 如果不能转换 就是null
    val d = c as? String
    println("d是c安全转换后的值:${d}")
}
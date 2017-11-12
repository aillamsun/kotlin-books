package com.william.kt.day2

/**
 *
 * 异常
 *
 * 对可能出现错误地方进行一种保护措施
 * 默认异常:Exception
 *
 * 语法 try{}catch(){}
 *
 * Created by sungang on 2017/11/12.
 */

fun main(args: Array<String>) {

    //1 直接展示错误信息
    try {
        "333".toInt()
    } catch (e: Exception) {
        e.printStackTrace()
    }

    //2 忽略错误
    val a: Int? = try {
        "333".toInt()
//        "331aaaa3".toInt()
    } catch (e: Exception) {
        null
    }
    println(a)

}
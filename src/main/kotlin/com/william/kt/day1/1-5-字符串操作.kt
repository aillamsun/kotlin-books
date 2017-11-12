package com.william.kt.day1

/**
 *
 *
 * Created by sungang on 2017/11/10.
 */

fun main(args: Array<String>) {
    var str1 = "chengdu"
    var str2 = "chengdu"

    //比较 ==  equals
    println(str1 == str2)
    println(str1.equals(str2))
    //忽略大消息
    str2 = "CHENGDU"
    println(str1.equals(str2, true))



    //字符串转整型：调用方法Integer.parseInt(***)
    //字符串转长整型：调用方法Long.parseLong(***)
    //字符串转浮点数：调用方法Float.parseFloat(***)
    //字符串转双精度数：调用方法Double.parseDouble(***)
    //字符串转布尔型：调用方法Boolean.parseBoolean(***)
    //字符串转字符数组：调用String对象的toCharArray方法
    //字符串转整型：调用String对象的toInt方法
    //字符串转长整型：调用String对象的toLong方法
    //字符串转浮点数：调用String对象的toFloat方法
    //字符串转双精度数：调用String对象的toDouble方法
    //字符串转布尔型：调用String对象的toBoolean方法
    //字符串转字符数组：调用String对象的toCharArray方法
}

package com.william.kt.day1

import com.sun.org.apache.xpath.internal.operations.Bool

/**
 *
 * 数据类型
 * Created by sungang on 2017/11/10.
 */


//********************************* Int 整数类型 ********************************************
var i : Int = 3
//或者
var i2 = 3 //可以省略 Int ，具有类型推断能力  java必须声明具体的类型
//********************************* Int 整数类型 ********************************************


//********************************* Double Float 浮点型 ********************************************
var pi : Double = 3.14
val oi2 = 3.14
val oi3 = 3.1
//********************************* Double Float 浮点型 ********************************************



//********************************* Boolean 布尔型 ********************************************
//表示逻辑上的 '真' 或 '假'
//只有两个值 true 或 false
var b : Boolean = true
//********************************* Boolean 布尔型 ********************************************

fun main(args: Array<String>) {
    println(pi.javaClass)
    println(oi2.javaClass)
    println(oi3.javaClass)


    println(b)
}
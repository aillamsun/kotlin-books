package com.william.kt.day1

/**
 *
 * 操作符
 *
 * Created by sungang on 2017/11/10.
 */
fun main(args: Array<String>) {
    //赋值操作符
    var a = 3
    a = -100
    val b = +a
    val c = -a

    println(b)
    println(c)

    //运算操作符 + - * ／ 用于运算操作
    println(3 + 4)
    println(3 - 4)
    println(3 * 4)
    println(3 % 4)
    println(3 / 4)

    //组合操作
    var gdp = 10000
    gdp += 100;
    println(gdp)

    //比较操作符 > >= < <= != == 返回true 或 false
    println(1 > 2)
    println(1 >= 2)
    println(1 < 2)
    println(1 <= 2)
    println(1 != 2)
    println(1 == 2)



    //逻辑操作符 || && !
    println(true || false)
    println(false || true)
    println(false || false)
    println(true && false)
    println(true && true)

    var tt = true;
    var xx = !tt;
    println(xx)
}
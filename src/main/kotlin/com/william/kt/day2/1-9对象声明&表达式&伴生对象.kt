package com.william.kt.day2

import java.util.*

/**
 *
 * 有时候只要对m某个类进行改造  供临时使用 避免继承
 * 对象声明和表达式
 *
 * 对面向对象的优化
 *
 * Created by sungang on 2017/11/12.
 */


open class Person(var name: String) {

    //肤色
    open var skin: String = "yellow"
}

//对象声明 不能用在函数中 一般用于对其他类一种使用上的声明
object UUIdUtils {
    fun getUUid(): String {
        return UUID.randomUUID().toString();
    }
}


//伴生对象 yi一般用于类的实例的 工厂 方法
//定义  companion object
//相当于 java的 static属性
class IDCard(var id: String) {
    companion object {
        fun create() = IDCard("100000101")
    }

}


fun main(args: Array<String>) {

    //如果外国人 就不适合继承

    //对象表达式 val 对象名 = object : 类/接口 {}
    //非洲人
    val baako = object : Person("Baako Zaid") {
        override var skin: String = "Black"
    }
    println("非洲改造姓名:${baako.name},肤色:${baako.skin}")

    //纯对象表达式 ：临时使用 无需继承任何类
    val tempParking = object {
        var x = 200
        var y = 300
    }
    println(tempParking.x)

    //伴生对象
    var idCard = IDCard.create();
    println(idCard.id)

    //
    println(UUIdUtils.getUUid())
}
package com.william.kt.day1

/**
 *
 * List 数组变更
 *
 *
 *
 * Created by sungang on 2017/11/10.
 */
fun main(args: Array<String>) {


    //定义List 默认不可变
    var itemList = emptyList<String>()
    var itemList2 = listOf<String>("1", "2")


    //可变List
    var itemNewList = itemList.toMutableList();


    //
    println("长度:${itemNewList.count()}")
    println("是否包含:${itemNewList.contains("1")}")
    println("是否为空:${itemNewList.isEmpty()}")

    itemNewList.add("1")
    itemNewList.add("2")
    itemNewList.add("2")

    println("是否包含:${itemNewList.contains("1")}")
    println("是否为空:${itemNewList.isEmpty()}")

    //获取第一个
    println(itemNewList.first())
    println(itemNewList[0])

    //获取出现的位置 indexOf()
    println(itemNewList.indexOf("1"))
    //获取最后一次出现的位置
    println(itemNewList.lastIndexOf("2"))



    //遍历 forEach
    itemNewList.forEach(::println)
    //for
    for (book in itemNewList) {
        println(book)
    }
}
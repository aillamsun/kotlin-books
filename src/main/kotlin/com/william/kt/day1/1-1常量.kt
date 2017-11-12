package com.william.kt.day1

/**
 * 预期范围内恒定不变的量
 *
 * 定义: val 常量名(任意文字 长度不限) 类似于 java final定义
 * 给常量一个值 叫 "赋值" val 常量 = 值
 *
 *
 * 注：常量不允许修改
 *
 * Created by sungang on 2017/11/10.
 */

val 兀 = 3.1415926
val 工资 = 1000
val name = "william"

val girlFriends = 10


fun main(args: Array<String>) {
    println(兀)
    println(工资)
    println(name)


    //这里提示 编译错误
//    name = "张三"
}
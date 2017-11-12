package com.william.kt.day1

/**
 *
 * k可空类型
 *
 * 代表一个值 可以为空的情况
 *
 * 如:用户资料填写 可能地址/性别 可空
 *
 * 形式: var 变量 : 类型?
 *
 * 无值则为null
 *
 * * Created by sungang on 2017/11/10.
 */


fun main(args: Array<String>) {

    var addr: String = "成都"
    var sex: Boolean?

    if (addr != null) {
        println("您的地址是:${addr}")
    }

    sex = false
    if (sex != null && sex == true) {
        println("您是男生")
    } else {
        println("您是女生")
    }
}
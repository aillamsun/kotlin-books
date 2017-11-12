package com.william.kt.day2

/**
 * 枚举类
 *
 * 有限个类型的列举
 *
 * Created by sungang on 2017/11/12.
 */


// 扑克牌花色
enum class PokerCard {
    红心,
    方片,
    梅花,
    黑桃
}

//衣服尺码 带构造器的枚举类
enum class Size(val height: Int) {
    S(150),
    M(160),
    L(170),
    XL(180),
    XXL(190),
}

fun main(args: Array<String>) {

    //列举所有
    println(PokerCard.values().joinToString())

    //列举单个
    println(Size.XXL.name)
    //序号
    println(Size.XXL.ordinal)

    //
    println(Size.values().joinToString { it.name + ":" + it.height })
}




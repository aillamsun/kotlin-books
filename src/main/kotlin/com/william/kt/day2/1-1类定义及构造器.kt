package com.william.kt.day2

import com.william.kt.day2.support.ShangHai
import com.william.kt.day2.support.SiChuan


/**
 *
 * class 默认是final 如果一个类要被继承 必须加 open关键字
 * Created by sungang on 2017/11/10.
 */


/**
 *
 */
fun main(args: Array<String>) {
    //实例化
    var xiaoyaoming = ShangHai("男")
    println("我是:${xiaoyaoming.region}人,我说:${xiaoyaoming.dialect},我的肤色属于:${xiaoyaoming.skin}")

    var guojingming = SiChuan("男", "SC")
    println("我是:${guojingming.region}人,我说:${guojingming.dialect},我的肤色属于:${guojingming.skin}")
}
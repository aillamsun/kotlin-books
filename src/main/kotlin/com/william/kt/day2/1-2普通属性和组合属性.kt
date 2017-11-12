package com.william.kt.day2

import com.william.kt.day2.support.ShangHai

/**
 * Created by sungang on 2017/11/10.
 */


fun main(args: Array<String>) {
    //实例化
    var xiaoyaoming = ShangHai("男")
    //设置薪水 区域随薪水变化 而变化
    xiaoyaoming.avgSalary = 8000.0

    println("我是:${xiaoyaoming.region}人,我说:${xiaoyaoming.dialect},我的肤色属于:${xiaoyaoming.skin}")
}
package com.william.kt.day2

import com.william.kt.day2.support.News

/**
 * Created by sungang on 2017/11/12.
 */


fun main(args: Array<String>) {
    //显示新闻列表
    println(News.Category().listDesc)

    //内部类 更改新闻地区 必须依赖主类的实例 以及自己的实例
    News().Language().changeRegoin("US")
}
package com.william.kt.day2

/**
 *
 * 数据类 只用于保存数据的类 比如用户登录信息 聊天记录
 * 这里保存并不是物理存储  而是转化为文本格式 便于保存
 * 定义 data class 类名
 *
 * 
 * Created by sungang on 2017/11/12.
 */
data class Article(
        var id: Int,
        var title: String
)

fun main(args: Array<String>) {
    val article = Article(1001, "Kotlin学习")
    //数据类的序列化
    println(article.toString())
}
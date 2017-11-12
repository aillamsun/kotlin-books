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

    //复制 生产一个对象克隆 并更改部分属性值
    var article2 = article.copy(title = "Kotlin学习2")
    println(article2.toString())

    //数据类对象解构
    val (id,title) = article2
    println("${id},${title}")

    //componentN
    println("${article2.component2()}")
}
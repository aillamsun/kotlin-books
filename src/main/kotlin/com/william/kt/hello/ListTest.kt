package com.william.kt.hello

import javafx.scene.control.Separator

/**
 * Created by sungang on 2017/11/9.
 */
fun forList() {
    val list = arrayListOf("10", "20", "30")
    list.add("40")
    list.add("50")
    list.add("50")
    for ((index, ele) in list.withIndex()) {
        println("$index:$ele")
    }
}

fun <T> joinToString(
        collection: Collection<T>,
        separator: String,
        prefix: String,
        postfix: String
): String {
    val result = StringBuffer(prefix)
    for ((i, e) in collection.withIndex()) {
        if (i > 0) result.append(separator)
        result.append(e)
    }

    result.append(postfix)
    return result.toString();
}

fun main(args: Array<String>) {
//    forList()
    var list = arrayListOf(1, 2, 3)
    println(joinToString(list, ";", "(", ")"))
}
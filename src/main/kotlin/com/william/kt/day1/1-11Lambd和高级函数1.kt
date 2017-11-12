package com.william.kt.day1

/**
 *
 *
 *
 *
 * Created by sungang on 2017/11/10.
 */

//Lambda表达式详细内容见“Lambda表达式”部分，这里先简要概述:
//1 Lambda表达一般使用“{ }”包围。
//2 它的参数（如果有的话）在“->”前定义，参数类型可能是省略的。
//3 函数体跟在“->”后面

fun main(args: Array<String>) {


    //1 高级函数 map
    var ints = asList(1, 2, 3, 4, 5, 6, 7, 8)
    //可以这样调用，当只有Lambda表达式参数时，调用函数时后面的“()”也可以省略：
    val doubledList = ints.map { it -> it * 2 } // == ints.map { it * 2 }
    println(doubledList)


    //2 高级函数 filter
    var nums = asList(1, 2, 3, 4, 5, 6, 7, 8)
    var sum = 0;
    //筛选偶数
    var c = nums.filter { it % 2 == 0 }.forEach {
        sum += it
        //偶数之和
        println(sum)
    }
//    for (i in c) {
//        print(i)
//    }

    //3 高级函数 groupBy
}
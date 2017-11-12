package com.william.kt.day1

/**
 * Created by sungang on 2017/11/10.
 */


fun main(args: Array<String>) {


    val a = 10
    val b = 20
    var max_0: Int = a

    /**
     * if
     */
    if (a > b) {
        max_0 = a

    } else {
        max_0 = b
    }

    println("----------------------------------")
    println("max_0:$max_0")
    println("----------------------------------")


    //简便 作为表达式
    var max_1 = if (a > b) a else b
    println("--------------")
    println("max_1:$max_1")
    println("--------------")

    //作为代码块
    println("--------------")
    val max_2 = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }
    println("max_2:$max_2")
    println("--------------")


    /**
     * When
     */
    //when取代了C风格语言的switch。相较switch而言，when语句显得更加的强大，灵活性更好。

    //传统用法
    val x: Int = 10

    when (x) {
        9 -> println("x:${x + 10}")
        10 -> println("x:$x")
        else -> print("x:$x")
    }

    //分支条件一致
    when (x) {
        0, 1 -> print("x == 0 or x == 1")
        else -> print("otherwise")
    }

    //使用任意表达式作为分支的条件
//    when (x) {
//        parseInt(s) -> print("s encode x")
//        else -> print("s does not encode x")
//    }
//
//    when (x) {
//        in 1..10 -> print("x is in the range")
//        in validNumbers -> print("x is valid")
//        !in 10..20 -> print("x is outside the range")
//        else -> print("none of the above")
//    }

    //作为表达式
//    val hasPrefix = when (x) {
//        is String -> x.startsWith("prefix")
//        else -> false
//    }

    /**
     * For
     *
     * for (item in collection)
     *  print(item)
     */

    val items = listOf<String>("apple", "orange", "kiwi")
    // 1
    for (item in items)
        println(item)

    // 2
    for (index in items.indices)
        println("item at $index is ${items[index]}")

    // 3
    for ((i, e) in items.withIndex())
        println("item at $i is $e}")

    //步长循环
//    forStepFizzBuzz()
    /**
     * while
     * dowhile
     */
    var num = 1
    var times = 0;
    var total = 0
    while (total < 5050) {
        total += num
        num += 1
        times += 1
    }
    println("累计次数:${times}")


    while (total < 5050) {
        total += num
        num += 1
        times += 1
        if (total == 5050) break
    }

    /**
     * 返回与跳转
     * continue
     * break
     *
     * 标签：
     * 在 Kotlin 中表达式可以添加标签，标签通过@结尾来表示，比如：abc@，fooBar@
     */

    //break
    val arraysA = listOf("A", "B", "C", "D")
    val arraysB = listOf(1, 2, 3, 4)
    for (itemA in arraysA) {
        for (itemB in arraysB) {
            if (itemB > 2) {
                break
            }
            println("itemB:$itemB")
        }

        if (itemA == "C") {
            break
        }
        println("itemA:$itemA")
    }

    //break和标签
    loop@ for (itemA in arraysA) {
        var i: Int = 0
        for (itemB in arraysB) {
            i++
            if (itemB > 2) {
                break@loop
            }

            println("itemB:$itemB")
        }

        println("i:$i")
        println("itemA:$itemA")
        println("---------")
    }

    //continue
    for (itemA in arraysA) {
        var i: Int = 0
        for (itemB in arraysB) {
            i++
            if (itemB > 2) {
                continue
            }

            println("itemB:$itemB")
        }

        if (itemA == "C") {
            continue
        }
        println("i:$i")
        println("itemA:$itemA")
        println("---------")
    }

    //continue和标签
    loop@ for (itemA in arraysA) {
        var i: Int = 0
        for (itemB in arraysB) {
            i++
            if (itemB > 2) {
                continue@loop
            }

            println("itemB:$itemB")
        }

        println("i:$i")
        println("itemA:$itemA")
        println("---------")
    }
}


fun forStepFizzBuzz() {
    for (i in 100 downTo 1 step 2) {
        println(fizzBuzz(i))
    }
}

fun fizzBuzz(i: Int) = when {
    i % 15 == 0 -> "FizzBuzz"
    i % 3 == 0 -> "Fizz"
    i % 5 == 0 -> "Buzz"
    else -> "$i"
}
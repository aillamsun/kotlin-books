# kotlin-books
kotlin-books 个人学习笔记记录

后续一致更新笔记

# 目录

## Day1 基础部分

> * 1-1常量
> * 1-2-变量
> * 1-3.1数据类型
> * 1-3.2类型安全
> * 1-4.1-集合List
> * 1-4.2-集合Set
> * 1-4.3-集合Map
> * 1-4-4集合数组
> * 1-5-字符串操作
> * 1-6-元组(Tuple)
> * 1-7-可空类型
> * 1-8-基础操作符
> * 1-9控制流程
> * 1-10函数
> * 1-11Lambd和高级函数1

##  Day2 面向对象部分

> * 1-1类定义及构造器
> * 1-2普通属性和组合属性


##  Day3 协议/泛型/扩展

> * 1-1 接口
> * 1-2 接口属性
> * 1-3 接口函数

# 基本类型
```kotlin
import com.sun.org.apache.xpath.internal.operations.Bool

/**
 *
 * 数据类型
 * Created by sungang on 2017/11/10.
 */


//********************************* Int 整数类型 ********************************************
var i : Int = 3
//或者
var i2 = 3 //可以省略 Int ，具有类型推断能力  java必须声明具体的类型
//********************************* Int 整数类型 ********************************************


//********************************* Double Float 浮点型 ********************************************
var pi : Double = 3.14
val oi2 = 3.14
val oi3 = 3.1
//********************************* Double Float 浮点型 ********************************************



//********************************* Boolean 布尔型 ********************************************
//表示逻辑上的 '真' 或 '假'
//只有两个值 true 或 false
var b : Boolean = true
//********************************* Boolean 布尔型 ********************************************

fun main(args: Array<String>) {
    println(pi.javaClass)
    println(oi2.javaClass)
    println(oi3.javaClass)


    println(b)
}
```
# 字符串操作
```kotlin
/**
 * Created by sungang on 2017/11/10.
 */

fun main(args: Array<String>) {
    var str1 = "chengdu"
    var str2 = "chengdu"

    //比较 ==  equals
    println(str1 == str2)
    println(str1.equals(str2))
    //忽略大消息
    str2 = "CHENGDU"
    println(str1.equals(str2, true))


    //字符串转整型：调用方法Integer.parseInt(***)
    //字符串转长整型：调用方法Long.parseLong(***)
    //字符串转浮点数：调用方法Float.parseFloat(***)
    //字符串转双精度数：调用方法Double.parseDouble(***)
    //字符串转布尔型：调用方法Boolean.parseBoolean(***)
    //字符串转字符数组：调用String对象的toCharArray方法
    //字符串转整型：调用String对象的toInt方法
    //字符串转长整型：调用String对象的toLong方法
    //字符串转浮点数：调用String对象的toFloat方法
    //字符串转双精度数：调用String对象的toDouble方法
    //字符串转布尔型：调用String对象的toBoolean方法
    //字符串转字符数组：调用String对象的toCharArray方法
}
```

# 集合相关
## 1 数组
```kotlin
/**
 *
 * 集合数组类型 : 可重复有序 Array 索引从0 开始
 *
 * 定义:  Array<类型> 或 arrayOf(元素1, 元素2, 元素3)
 *
 * 大小固定 元素类型不可变
 *
 * Created by sungang on 2017/11/10.
 */

fun main(args: Array<String>) {

    //地铁1号线: arrayOf("金融城","孵化园","锦城广场","世纪城","天府三街","天府五街")

    //创建数组
    var no1stations = arrayOf("金融城","孵化园","锦城广场","世纪城","天府三街","天府五街","天府五街");
    for (no1station in no1stations) {
//        println(no1station)
    }


    //创建一个有默认值的数组
    var no1stationsNamePlacehloders = Array(5,{"占位符"})
    for (no1stationsNamePlacehloder in no1stationsNamePlacehloders){
//        println(no1stationsNamePlacehloder)
    }


    //创建1 - 10 数组 Array(10,{ i -> i + 1})
    // i代表元素索引值
    var oneToTen = Array(10,{ i -> i + 1});
    for (i in oneToTen) {
//        println(i)
    }

    //获取数组元素计数 count ，是否为空 isEmpty()
//    println("元素个数:${oneToTen.count()}")
//    println("是否为空:${oneToTen.isEmpty()}")


    //获取数组元素值:数组[索引] 首个元素:数组.first 最后一个:数组.last
    //

//    println("oneToTen第一个元素:${oneToTen[0]}")
//    println("oneToTen第一个元素:${oneToTen.component1()}")
//    println("oneToTen第一个元素:${oneToTen.first()},最后一个元素:${oneToTen.last()}")


    //获取筛选后的数组.distinct() 或者 .toSet()转化为Set集合
    // 天府五街 就会去重 适合数组去重
//    var no1stationsNoRepeat = no1stations.distinct();
    var no1stationsNoRepeat = no1stations.toSet();
    for (s in no1stationsNoRepeat) {
//        println(s)
    }


    //数组切割sliceArray()
    var oneToTenSliceArray = oneToTen.sliceArray(2..5)
    for (i in oneToTenSliceArray) {
        println(i)
    }


    /**
     * mutableListOf() 或 MutableList<类型>(元素1,元素2,元素3)
     * 大小可变，类型不可变
     */
    var no1NewsStations = mutableListOf("金融城", "孵化园", "锦城广场", "世纪城", "天府三街", "天府五街");
    //add 在末尾加元素  addAll添加另一个数组
    no1NewsStations.add("华府大道")
    no1NewsStations.addAll(mutableListOf("四河","广都"))
    for(no1NewsStation in no1NewsStations){
        println(no1NewsStation)
    }

    //remove removeAll removeAt
    no1NewsStations.removeAt(0)
    no1NewsStations.remove("广都")
    no1NewsStations.removeAll(no1NewsStations)
}

```

## 2 Set
```kotlin
/**
 *
 * Set是最简单的一种集合。集合中的对象不按特定的方式排序，并且没有重复对象。
 *
 * 定义:setOf() 或 Set<类型>(元素1,元素2,元素13)
 * Kotlin没有专门的语法用来创建set,可以使用标准库中的方法, 比如setOf(),mutableSetOf()。
 *
 * emptySet(): Set - 创建一个空的只读Set
 * setOf(vararg T): Set - 创建一个只读Set
 * mutableSetOf(vararg elements): MutableSet - 创建一个可变Set
 * 
 * val size: Int - 集合中元素的数量
 * fun isEmpty(): Boolean - 判断集合是否为空
 * fun contains(E): Boolean - 判断集合中是否包含某一元素
 * fun iterator(): Iterator - 返回该只读集合的元素的迭代器
 *
 * Created by sungang on 2017/11/10.
 */
fun main(args: Array<String>) {


    var no1stations = setOf("天府广场","金融城", "孵化园", "锦城广场", "世纪城", "天府三街", "天府五街", "天府五街");
    var no1stations2 = setOf("金融城", "孵化园", "锦城广场");

    //2号线 1号线 换乘站点
    var no2stations = setOf("天府广场");
    //3号线 1号线 换乘站点
    var no3stations = setOf("省体育馆");

//    for (no1station in no1stations) {
//        println(no1station)
//    }

    //元素计数count() 是否为空 isEmpty()
    println("数量:${no1stations.count()}")
    println("是否为空:${no1stations.isEmpty()}")
    println("是否包含:${no1stations.contains("天府广场")}")


    //检查是否包含某个元素contains() 是否包含某个集合
    println("是否包含元素[世纪城]:${no1stations.contains("世纪城")}")
    println("是否包含集合[no1stations2]:${no1stations.containsAll(no1stations2)}")

    //转化为数组toTypedArray
    var no1stationsArr = no1stations.toTypedArray();
//    for (s in no1stationsArr) {
//        println(s)
//    }

    //集合之间的运算 intersect():交集,subtract():差集,union():并集,minus(): 补集，被操作类型无序是Set集合
    //换乘站交集
    println(no1stations.intersect(no2stations))
    //差集
    println(no1stations.subtract(no2stations))
    //并集
    println(no1stations.union(no2stations).union(no3stations))
    //补集
    println(no1stations.minus(no2stations))


    /**
     * 转换为可变:MutableSet
     *
     */
    var no1NewsStations = no1stations.union(no2stations).union(no3stations).toMutableSet();
    no1NewsStations.add("倪家桥")
    var newStations = arrayOf("火车南站","高新站")
    no1NewsStations.addAll(newStations)

    //删除一个元素
    no1NewsStations.remove("倪家桥")
    //删除一个集合
    no1NewsStations.removeAll(newStations);
}
```

## 3 Map
```kotlin
/**
 *
 * 集合类型:Map
 *
 * 无序可重复 类似于字典概念 不可变
 *
 * key value
 *
 * Created by sungang on 2017/11/10.
 */
fun main(args: Array<String>) {
    //定义一个map 使用元组 形式
    var ariPorts = mapOf<String, String>(Pair("1", "One"), Pair("2", "Two"), Pair("3", "Three"))
    //
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
    println(map.javaClass)
    println(ariPorts.javaClass)

    //元素计数size 是否为空isEmpty()
    println("ariPorts SIZE():${ariPorts.size}")
    println("ariPorts 是否为空():${ariPorts.isEmpty()}")


    //获取单个key 对应的value ： get()
    println(ariPorts.get("1"))
    println(ariPorts["1"])

    //所有key 对应的value
    for (v in ariPorts.values) {
        println(v)
    }
    for ((k,v) in ariPorts){
        println("$k -> $v")
    }

    //
//    ariPorts.toMutableMap();
//    ariPorts["1"] = "第一个元素"
}
```
## 4,List
```kotlin
/**
 *
 * List 数组变更
 *
 *
 *
 * Created by sungang on 2017/11/10.
 */
fun main(args: Array<String>) {


    //定义List 默认不可变
    var itemList = emptyList<String>()
    var itemList2 = listOf<String>("1", "2")


    //可变List
    var itemNewList = itemList.toMutableList();


    //
    println("长度:${itemNewList.count()}")
    println("是否包含:${itemNewList.contains("1")}")
    println("是否为空:${itemNewList.isEmpty()}")

    itemNewList.add("1")
    itemNewList.add("2")
    itemNewList.add("2")

    println("是否包含:${itemNewList.contains("1")}")
    println("是否为空:${itemNewList.isEmpty()}")

    //获取第一个
    println(itemNewList.first())
    println(itemNewList[0])

    //获取出现的位置 indexOf()
    println(itemNewList.indexOf("1"))
    //获取最后一次出现的位置
    println(itemNewList.lastIndexOf("2"))



    //遍历 forEach
    itemNewList.forEach(::println)
    //for
    for (book in itemNewList) {
        println(book)
    }
}
```

# 流程控制
```kotlin
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
```

# 函数
```kotlin
package com.william.kt.day1

import sun.security.provider.certpath.Vertex
import java.util.*

/**
 *
 * 函数
 * Created by sungang on 2017/11/10.
 */
//1 函数声明
//2 函数的参数定义格式：name: type，参数间使用“,”分割，每个参数需要显式定义确定的类型：
//3 返回“Unit”类型函数 void 若一个函数不需要返回任何有效值，那么它的返回类型为“Unit”。“Unit”类型只有一个值，即“Unit”。另，可以不显示返回Unit：


//在kotlin中用关键字fun声明函数:
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b;
}

// 3 默认实参定义（Default Arguments）
//参数可以设置默认值，该参数在使用的时候可以省略；可以减少重载的函数个数。
//语法：在类型类型后面使用“ = ”添加默认值：
fun read(b: Array<Int>, off: Int = 0, len: Int = b.size) {
}

//4 命名参数（Named Arguments）
fun reformat(str: String,
             normalizeCase: Boolean = true,
             upperCaseFirstLetter: Boolean = true,
             divideByCamelHumps: Boolean = false,
             wordSeparator: Char = ' ') {
}

fun reformat2(str,
              normalizeCase = true,
              upperCaseFirstLetter = true,
              divideByCamelHumps = false,
              wordSeparator = '_') {
}

fun printHello(name: String?): Unit {
    if (name != null)
        println("Hello ${name}")
    else
        println("Hi there!")
}

//效果一样
fun printHello2(name: String?) {
    if (name != null)
        println("Hello ${name}")
    else
        println("Hi there!")
}


/**
 * 单表达式函数（Single-Expression functions）
 */
fun double(x: Int): Int = x * 2

//缩写 编译器可以推断出返回值类型时，函数定义时的返回值类型也可以省略：
fun double2(x: Int) = x * 2

/**
 * 显式返回类型（Explicit return types）
 */

/**
 * 可变参数数量（Variable number of arguments (Varargs)）
 * 在函数内部，被“vararg”修饰的参数实际上是一个数组（Array<out T>）。
 * 一个函数，只能有一个参数可以使用“vararg”关键字修饰，一般放在最后一个参数
 * 若不是最后一个参数，在使用时，其他的参数可以使用命名参数（Named Arguments）
 * 方式；或者函数有一个功能类型参数，可以在函数的后面定义一个Lambda表达式实现。
 */
//使用“vararg”关键字修饰参数，即可定义为可变数量参数（一般是最后一个参数）：
fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}

//该函数可以接收不定个数参数：
//val list = asList(1, 2, 3)
//  调用一个“vararg”函数时，可以一个一个值使用，如“asList(1, 2, 3)”；也可以直接使用一个存在的数组数据，使用“*”关键字：
val a = arrayOf(1, 2, 3)
val list = asList(-1, 0, *a, 4)


/**
 * 函数范围（Function Scope）
 * 在Kotlin中，函数可以定义为顶层（top leve），表示不需要一个类去持有该函数。另外，还可以定义为局部，如类的成员函数，扩展函数。
 */

//1 局部函数（Local Functions） Kotlin支持局部函数，即在函数内部定义的函数：
// 局部函数，可以访问外层函数的局部变量：

//2 成员函数（Member Functions） 定义在一个类或对象中的，称为成员函数。
class Sample() {
    fun foo() {
        print("Foo")
    }
}

//3 泛型函数（Generic Functions）
fun <T> singletonList(item: T): List<T> {
    // ...
    return listOf();
}

//4 内联函数（Inline Functions）
//5 扩展函数（Extension Functions）
//高阶函数和Lambda表达式（Higher-Order Functions and Lambdas）
//6 尾递归函数（Tail recursive functions）  Kotlin支持尾递归函数，允许一些算法使用递归方式代替循环；而且不会有堆栈溢出的风险。使用“tailrec”关键字修饰，编译器可以优化递归，生成一个快速、高效的循环版本。
tailrec fun findFixPoint(x: Double = 1.0): Double
        = if (x == Math.cos(x)) x else findFixPoint(Math.cos(x))

// 等同
private fun findFixPoint(): Double {
    var x = 1.0
    while (true) {
        val y = Math.cos(x)
        if (x == y) return y
        x = y
    }
}

//使用“tailrec”修饰的尾递归函数需要满足下面几个条件：
//1 函数体最后一行执行代码需要是调用函数本身。
//2 不能在递归的函数后面还有其他的代码。
//3 递归部分不能放到“try/catch/finally”中。


/**
 * 函数使用
 */
fun main(args: Array<String>) {
    var max = max(1, 2);
    println(max)

    //成员函数，通过“.”方式访问：
    Sample().foo()


    //命名参数 可以通过该方式调用：
    reformat("哈哈")
    //当该函数的所有参数都没有设置默认值，则需要这样调用：
    reformat("哈哈", true, true, false, '_')

    reformat2("哈哈", wordSeparator = '_')
}
```
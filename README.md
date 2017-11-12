# kotlin-books
kotlin-books 个人学习笔记记录

后续一致更新笔记

# 目录

## Day1 

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

# Day2

> * 1-1类定义及构造器
> * 1-2普通属性和组合属性


# 基本类型
```kotlin
package com.william.day1

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
# 集合相关
## 1 数组
```kotlin
package com.william.day1

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
package com.william.day1

/**
 *
 * 集合类型Set:无序不重复 大小固定 元素类型不可变
 *
 * 定义:setOf() 或 Set<类型>(元素1,元素2,元素13)
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

```
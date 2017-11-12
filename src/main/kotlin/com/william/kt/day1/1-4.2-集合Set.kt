package com.william.kt.day1

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
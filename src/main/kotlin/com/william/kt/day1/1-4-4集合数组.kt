package com.william.kt.day1

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

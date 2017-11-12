package com.william.kt.hello.lambda

/**
 * Created by sungang on 2017/11/9.
 */


fun findTheOldest(persons: List<Person>) {
    var maxAge = 0;
    var theOldest: Person? = null
    for (p in persons) {
        if (p.age > maxAge) {
            maxAge = p.age
            theOldest = p;
        }
    }
    println(theOldest)
}

fun main(args: Array<String>) {

    val person = listOf(Person("张三", 29), Person("李四", 32))
//    findTheOldest(person) //old

    println(person.maxBy { it.age })
    println(person.maxBy(Person::age))
}
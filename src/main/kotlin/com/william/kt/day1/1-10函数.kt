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

//fun reformat2(str,
//              normalizeCase = true,
//              upperCaseFirstLetter = true,
//              divideByCamelHumps = false,
//              wordSeparator = '_') {
//}

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

//    reformat2("哈哈", wordSeparator = '_')
}
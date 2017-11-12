package com.william.kt.hello.inter

/**
 * Created by sungang on 2017/11/9.
 */
open class RichButton : Clickable {

    override fun click() {} //如果没有被 final 修饰 默认是open的

    fun disables(){} //这个函数是final 不能在子类被重写

    open fun animate(){}//这个类 是open 可以在子类被重写
}
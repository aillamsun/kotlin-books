package com.william.kt.hello.inter

/**
 * Created by sungang on 2017/11/9.
 */
interface Focusable {

    fun setFocus(b: Boolean) =
            println(" I ${if (b) "got" else "lost"} focus.")

    fun showOff() = println(" I'm Focusable")
}
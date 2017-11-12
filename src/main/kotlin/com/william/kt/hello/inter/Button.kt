package com.william.kt.hello.inter

/**
 * Created by sungang on 2017/11/9.
 */
class Button : Clickable, Focusable {

    override fun click() = print(" I Was clicked")

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }

}

fun main(args: Array<String>) {
    val bu = Button()

    bu.showOff()
    bu.setFocus(true)
    bu.click()
}
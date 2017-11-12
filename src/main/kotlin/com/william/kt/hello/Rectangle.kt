package com.william.kt.hello

import java.util.*

/**
 * Created by sungang on 2017/11/9.
 */
class Rectangle(val height: Int, val width: Int) {
    val isSqure: Boolean
        get() = width == height;
}


fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt());
}
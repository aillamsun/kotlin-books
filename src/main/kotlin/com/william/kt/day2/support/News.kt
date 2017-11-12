package com.william.kt.day2.support

/**
 * Created by sungang on 2017/11/12.
 */
class News {

    //默认地区
    private var lang = "cn";

    /**
     *
     * 嵌套类
     * 分类 与主类并不是十分密切 只是形式上的合作 主从关系
     */
    class Category {
        var list = arrayOf("新闻", "娱乐", "科技", "体育", "美女")
        var listDesc = list.joinToString()
    }

    /**
     * 内部类 ：新闻语种 通常不对外使用 只为主类服务
     */
    inner class Language {
        fun changeRegoin(newRegoin: String) {
            //内部类可以访问主类属性
            lang = newRegoin

            println("现在可以查看${newRegoin}新闻")
        }
    }
}
package com.william.kt.day2.support

/**
 * Created by sungang on 2017/11/12.
 */

//中国人
open class Chinese constructor(var sex: String, var region: String) {
    //普通属性
    //肤色
    open var skin = "yellow"
    //组合属性 由其他属性计算而来(get)
    //平均年纪
    val avgLife: Double
        get() {
            when (this.region) {
                "SH" -> {
                    return 82.4
                }
                "SC" -> {
                    return 86.7
                }
                "HN" -> {
                    return 77.8
                }
                else -> {
                    return 74.2
                }
            }
        }

    //平均工资
    var avgSalary: Double
        get() {
            when (this.region) {
                "SH" -> {
                    return 10000.0
                }
                "SC" -> {
                    return 8000.0
                }
                "HN" -> {
                    return 7800.0
                }
                else -> {
                    return 6500.0
                }
            }
        }
        set(value) {
            when (value) {
                in 9000.0..Double.MAX_VALUE -> {
                    this.region = "SH"
                }
                in 7800.0..8200.0 -> {
                    this.region = "SC"
                }
                in 6500.0..6510.0 -> {
                    this.region = "HN"
                }
                else -> {
                    this.region = "Other"
                }
            }
        }


    //函数定义
    /**
     * 厨艺
     */
    open fun cook() {
        //菜单
        val menu = arrayOf("青椒炒肉丝", "番茄炒蛋", "紫菜蛋花汤")
        val desc = menu.reduce { s1, s2 -> s1 + "," + s2 }
        println("我会:${desc}")
    }
}

//定义一个上海人
class ShangHai(sex: String, region: String = "SH") : Chinese(sex, region) {
    //方言
    var dialect = "上海话"
    override var skin = "ShangHaiYellow"
}

//定义一个四川人
class SiChuan(sex: String, region: String) : Chinese(sex, region) {
    //方言
    var dialect = "四川话"
    override var skin = "SiChuanYellow"

    /**
     * 重写函数
     */
    override fun cook() {
        super.cook()
        val menu = arrayOf("鱼香肉丝", "麻婆豆腐")
        val desc = menu.reduce { s1, s2 -> s1 + "," + s2 }
        println("我是:${this.region}人,我还会:${desc}")
    }
}

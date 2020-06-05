package com.chiang.kotlin

class App {
    fun print(str: String): String {
        print(str)
        return str
    }

}

fun test() {}
class Runoob {}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sum1(a: Int, b: Int) = a + b

public fun sum2(a: Int, b: Int): Int = a + b//public 方法必须明确写出返回类型

//fun printSum(a: Int, b: Int): UInt {
//返回类型是Unit类型，则可以省略（对于public方法也是这样）：
public fun printSum(a: Int, b: Int) {
    print(a + b)
}

//可变长参数函数
fun vars(vararg v: Int) {
    for (vt in v) {
        print(vt.toString() + " ")
    }
}

//lambda(匿名函数)
fun lambda() {
    val sumLambda: (Int, Int) -> Int = { x, y -> x + y }
    print(sumLambda(1, 2))
}

fun printTest(str: String?): String? {
    print(str)
    return str
}

/**
 * 可变变量定义 var <标识符>:<类型> =<初始化值>
 * 不可变变量定义 val，只能赋值一次的变量（java final）<标识符>:<类型> =<初始化值>
 */

fun main(args: Array<String>) {
    val a: Int = 1
    val b = 1 //系统自动推理变量类型为
    val c: Int //如果不在声明时初始化则必须提供变量类型
    c = 1//明确赋值
    var x = 5
    x += 1
    //字符串模板
    var m = 1
    val model1 = "model var $m"
    val model2 = "${model1.replace("var", "val")},but now is $m"
    println(model1)
    println(model2)
    println("Hello World!")
    vars(1, 2, 3)
    lambda()

    /**
     * NULL检测机制
     * Kotlin的空安全设计对于声明可为空的参数，
     * 在使用时要进行空判断处理，有两种处理方式，
     * 字段后加!!像Java一样抛出空异常，
     * 另一种字段后加?可不做处理返回值为 null或配合?:做空判断处理
     */
    //类型后面加?表示可为空
    var age: String? = "23"
    //如果age为空，抛出空指针异常
    val ages = age!!.toInt()
    println(ages)
    var ages1m = null
    //如果age为空，不做处理返回 null
    val ages1 = ages1m?.toInt()
    println(ages1)
    //age为空返回-1
    val ages2 = age?.toInt() ?: -1
    print("----");
    println(ages2)

}

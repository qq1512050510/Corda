package com.chiang.test

import java.util.*;

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
    println("Hello World!")
    vars(1, 2, 3)
    lambda()
}
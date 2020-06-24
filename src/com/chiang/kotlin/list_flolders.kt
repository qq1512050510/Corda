package com.chiang.kotlin

import java.io.File

fun findFolders(location: String) {
    val folders = File(location).listFiles { file -> file.isDirectory() }
    folders?.forEach { folder -> println(folder) }
}

fun main(args: Array<String>) {
    val folders = File(args[0]).listFiles { file -> file.isDirectory() }
    folders?.forEach { folder -> println(folder) }
}


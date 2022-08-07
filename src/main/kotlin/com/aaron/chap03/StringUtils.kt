package com.aaron.chap03

fun isDirectoryPath(path: String): Boolean {
    return path.endsWith("/")
}
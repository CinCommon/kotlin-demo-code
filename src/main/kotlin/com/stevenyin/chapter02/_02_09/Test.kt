package com.stevenyin.chapter02._02_09

import com.stevenyin.chapter02._02_08.createRandomRectangle

class Test

fun main() {
	println("Hello World!")
	for (i in 1..100) {
		println(createRandomRectangle().isSquare)
	}
}

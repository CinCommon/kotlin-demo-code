package com.stevenyin.chapter02._02_27

import java.io.BufferedReader
import java.io.StringReader

class TrycatchTest

fun readNumber(reader: BufferedReader): Int? {
	try {
		val line = reader.readLine()
		return Integer.parseInt(line)
	} catch (e: NumberFormatException) {
		return null
	} finally {
		reader.close()
	}
}

fun main(args: Array<String>) {
	val reader = BufferedReader(StringReader("234"))
	println(readNumber(reader))
}
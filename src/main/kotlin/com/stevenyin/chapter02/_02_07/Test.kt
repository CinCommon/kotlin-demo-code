package com.stevenyin.chapter02._02_07

import com.stevenyin.chapter02._02_05.Person

class Test

fun main(args: Array<String>) {
	val person = Person("Bob", true)
	println(person.name)
	// Bob
	println(person.isMarried)
	// true
}

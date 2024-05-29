package org.example

const val CITY_MESSAGE: String = "Enter your city: "
const val RESPONSE_MESSAGE: String = "User lives in"
var input: String = ""
fun main() {
    print(CITY_MESSAGE)
    input = readln()
    println("$RESPONSE_MESSAGE $input")
}

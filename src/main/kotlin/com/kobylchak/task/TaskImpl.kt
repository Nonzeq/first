package org.example.com.kobylchak.task

const val RESPONSE_MESSAGE: String = "User lives in"
const val CITY_MESSAGE: String = "Enter your city: "
var input: String = ""
fun main() {
    print(CITY_MESSAGE)
    input = readln()
    println("$RESPONSE_MESSAGE $input")
}

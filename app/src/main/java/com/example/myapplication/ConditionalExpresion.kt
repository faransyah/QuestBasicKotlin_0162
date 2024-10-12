package com.example.myapplication

// Conditional Expression
// Conditional Expression adalah ekspresi yang mengembalikan nilai berdasarkan kondisi tertentu
// Conditional Expression menggunakan if-else, when, dan try-catch

fun ConditionalStatemet() {
    println("=== Conditional Expression ===")

    // If-Else
    val number = 10
    if (number > 0) {
        println("Positive Number")
    }else {
        println("Negative Number")
    }

    // When
    val day = 1
    when (day) {
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Teusday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> println("Invalid Day")
    }





}
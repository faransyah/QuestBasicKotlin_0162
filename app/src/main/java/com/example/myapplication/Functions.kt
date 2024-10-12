package com.example.myapplication

fun withoutParameter() {
    println("== withoutParameter ==")
    println("Hello, World!")
}

fun withParameter(name: String) {
    println()
    println("== withParameter ==")
    println("Hello, $name!")
}

// Named argument
// Named argument adalah cara untuk memanggil fungsi dengan menyebutkan nama parameter
fun withNamedArgument(name: String, age: Int) {
    println()
    println("=== withNamedArgument ===")
    println("Hello, $name! You are $age years old.")
}

// Default parameter value
// Default parameter value merupakan cara untuk memberikan nilai default pada parameter fungsi
fun withDefaultParameter(name: String = "Indra", age: Int) {
    println()
    println("=== withDefaultParameter ===")
    println("Hello, $name! You are $age years old.")
}

// Fungsi dengan return value
fun withReturn(panjang: Int, lebar: Int): Int {
    return panjang * lebar  // Hanya mengembalikan hasil perhitungan
}

fun main() {
    withoutParameter()
    withParameter("John")

    withNamedArgument(name = "John", age = 30)
    withDefaultParameter(age = 25)

    // Contoh penggunaan fungsi withReturn
    val area = withReturn(5, 10)
    println("Area: $area")
}

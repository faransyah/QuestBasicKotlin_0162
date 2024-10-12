package com.example.myapplication

fun Contohlist(){
    println("=== List ===")
    // List Read-Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    // List Mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    // Menambahkan data kedalam List Mutable
    shape.add("Circle")
    println(shape)

    // Menghapus data dari List Mutable
    shape.remove("Triangle")

    // Menambah data di dalam List Mutable
    shape[0] = "Oval"
    println(shape)

    // List Read-Only
    val shapeLocked: List<String> = shape
    println(shapeLocked)

}

fun ContohSet() {

}
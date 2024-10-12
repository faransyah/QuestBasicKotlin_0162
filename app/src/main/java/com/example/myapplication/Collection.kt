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

// Set adalah Kumpulan data yang tidak memiliki posisi atau urutan tertentu dan hanya menyimpan data unik(tidak ada duplikasi)
// Set bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
// Set bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// Set Read-Only menggunakan set0f
// Set Mutable menggunakan mutableSet0f

fun ContohSet() {
    println()
    println(" === Set === ")

// Set Read-Only
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

// Set Mutable
    val shape: MutableSet<String> = mutableSet0f("Circle", "Square", "Triangle")
    println(shape)

// Menambahkan data ke dalam Set Mutable
    shape.add("Rectangle")
    println(shape)

// Menghapus data dari Set Mutable
    shape. remove("Circle")
    println(shape)

// Set Read-Only
    val shapesLocked: Set<String> = shape
    println(shapesLocked)
}
// Map adalah Kumpulan data yang disusun dalam pasangan key-value
// Map bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
// Map bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// Map Read-Only menggunakan map0f
// Map Mutable menggunakan mutableMapOf

fun ContohMap() {

    println()
    println("=== Map ===")
    // Map Read-Only
    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(readOnlyShape)

    // Map Mutable
    val shape: Map<String, Int> = mutableMapOf() Of("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(shape)

    //Menambahkan data dari Map Mutable
    shape["Rectangle"] = 4
    println(shape)

    // Mengubah data didalam Map Mutable

    shape.remove("Circle")
    println(shape)

    // Mengubah data di dalam Map Mutable
    shape["Square"] = 5
    println(shape)

    // Map Read-Only
    val shapesLocked: Map<String, Int> = shape
    println(shapesLocked)
}




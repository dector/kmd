package io.github.dector.kmd

fun main() {
    val nameValidator = { str: String -> str.length >= 3 }

    val name = Cli.string("Enter your name",
        validator = nameValidator)

    println()
    println("Hello, $name!")
}

package io.github.dector.kmd


object Cli

fun Cli.string(
    prompt: String,
    validator: (str: String) -> Boolean = { true }
): String {
    var value: String
    do {
        print("$prompt: ")
        value = readLine() ?: ""
    } while (!validator(value))

    return value
}

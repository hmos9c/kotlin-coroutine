/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package hmos9c.coroutine

class App {
    val greeting: String
        get() {
            return "Hello world."
        }
}

fun main(args: Array<String>) {
    println(App().greeting)

    println("Running in thread ${Thread.currentThread().name}")
}

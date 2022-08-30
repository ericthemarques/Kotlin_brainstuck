package mycodes

fun main() {
    sayHello("Eric", 20, "code")
}

fun sayHello(name: String, age: Int, hobby: String) {
    println("Hello ${name}!")
    println("So... you have ${age} years, and you like to ${hobby}")
}
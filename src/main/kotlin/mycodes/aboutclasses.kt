package mycodes

class Person(var name: String, var age: Int, val favoriteFood: String) { // utilizar method ToString para printar o object
    override fun toString(): String {
        return "Seu nome é ${name}, tem a idade de ${age}, e gosta de comer ${favoriteFood}"
    } // para usar o toString, utilizar váriaveis no tipo da classe...
}

fun main() {
    var Eric = Person("Eric", 20, "Sushi")
    println(Eric) // mexendo com classes...
}
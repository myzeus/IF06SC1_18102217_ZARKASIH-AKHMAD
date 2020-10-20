fun main() {
    val user = setUser("Tony Stark", 19)
    println(user)
    printUser("Tony Stark ")
}

//single line function
fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

//normal function
fun printUser(name: String) {
    println("Your name is $name")
}

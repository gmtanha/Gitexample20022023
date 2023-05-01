import sun.misc.Version.println

open class Animal(var name: String, var weight: String) {
    fun printInfo(){
        println("Name: $name, Weight: $weight")
    }
}
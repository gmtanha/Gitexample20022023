class Cat (name: String, weight: String, var color: String): Animal(name, weight) {
    override fun printInfo() {
        super.printInfo()
        println("Cat printInfo")
        }
    }


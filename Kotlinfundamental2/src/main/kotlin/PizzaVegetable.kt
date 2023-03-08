class PizzaVegetable: Pizza() {
    override fun prepare() {
        println("PizzaVegetable prepare")
    }

    override fun bake() {
        println("PizzaVegetable bake")
    }

    override fun cut() {
        println("PizzaVegetable cut")
    }

    override fun box() {
        println("PizzaVegetable box")
    }

}
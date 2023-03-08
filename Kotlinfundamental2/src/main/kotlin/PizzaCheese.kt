class PizzaCheese: Pizza() {
    override fun prepare() {
        println("PizzaCheese prepare")
    }

    override fun bake() {
        println("PizzaCheese bake")
    }

    override fun cut() {
        println("PizzaCheese cut")
    }

    override fun box() {
        println("PizzaCheese box")
    }
}
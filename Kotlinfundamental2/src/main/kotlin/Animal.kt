import javafx.scene.text.FontWeight

open class Animal(var name: String, var weight: String) {
    // 1: Thuộc tính
    // 2: Chức n0ăng

    // null safety
//    fun printInfo(){
//        println("Name: $name, weight: $weight")
//    }
//
//        var name: String = ""
//            set(value) {
//                if (value == "") throw Exception("Null")
//                field = value
//            }
//            get() { return "Get $field" }
//
//        var weight: String = ""
//            get() { return "Weight $field" }
//            set(value) {
//                field = value
//            }
//
    open fun printInfo() {
            println("Name: $name, weight: $weight")
        }


}


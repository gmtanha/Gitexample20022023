import sun.plugin2.message.Message
import kotlin.random.Random

fun main(args: Array<String>) {
//        println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//        println("Program arguments: ${args.joinToString()}")
//    var number1 = 5
//    var number2 = 7
//    var result = ++number1 - --number2 + number1++ - number2++ + number2--
//    6 - --number2 + number1++ - number2++ + number2--; a=6, b=7
//    6 - 6 + number1++ - number2++ + number2--; a=6, b=6
//    6 - 6 + 6 - number2++ + number2--; a=7, b=6
//    6 - 6 + 6 - 6 + number2--; a=7, b=7
//    6 - 6 + 6 - 6 + 7; a=7, b=6
//    var result = ++number1 - --number2 + number1++ - number2++ + number2--
//    println("Number1: $number1")
//    println("Number2: $number2")
//    println("Result: $result")
//    var weight:Float = 74.5f
//    var height:Float = 1.75f
//    var bmi = weight/(height*height)
//    var message:String
//    var maxValueThin = 18.5f
//    var maxValueNomal = 24.9f
//    var maxValueOverWeight = 29.9f
//    var maxValueFatLevel1 = 34.9f
//    var maxValueFatLevel2 = 39.9f
//
//    if (bmi<maxValueThin){
//        message = "Gầy"
//    }else if (bmi<maxValueNomal){
//        message = "Bình thường"
//    }else if (bmi<maxValueOverWeight){
//        message = "Hơi béo"
//    }else if (bmi<maxValueFatLevel1){
//        message = "Béo cấp độ 1"
//    }else if (bmi<maxValueFatLevel2){
//        message = "Béo cấp độ 2"
//    }else {
//        message = "Béo cấp độ 3"
//    }
//    println("Chỉ số khối cơ thể: $bmi")
//    println("Tình trạng sức khỏe: $message")
    //    var month = 6
    //    var message = when (month){
    //        in 1..3 -> "Quý 1"
    //        in 4..6 -> "Quý 2"
    //        in 7..9 -> "Quý 3"
    //        in 10..12 -> "Quý 4"
    //        else -> "Không thuộc quý nào"
    //    }
//        println(message)

//        var numberA = 5
//        var numberB = 10
//        var message: String = if (numberA>numberB){
//            "A lớn hơn B"
//        }else if (numberA<numberB) {
//            "A nhỏ hơn B"
//        }else{
//            "A bằng B"
//        }
//        println(message)

//        var isMale = true
//        var message:String = if(isMale) {
//            "Đàn ông"
//        }else if (!isMale) {
//            "abc"
//        }else{
//            "Đàn bà"
//        }
//        println(message)

//    var account = ""
//    var password = ""
//    if (account.length==0 || password.length==0) {
//        println("Chưa truyền đủ thông tin")
//    }else {
//        println("Xử lý đăng nhập")
//    }

//    for((index,item) in (1..10 step 2).withIndex()) {
//        println("Index: $index, Item: $item")
//    }
//    for ((index,item)in(1..10).withIndex()){
//        println("Index: $index, Item: $item")
//    }
//    for (item in 10 downTo 1){
//        println(item)
//    }
//    var count = 0
//    for (item in 1..100 ){
//        if (item % 2 ==0 && item % 5 ==0 ){
//            count ++
//            if (count == 2){
//            println(item)
//            break
//            }
//        }
//    }
//    println("Tiếp tục")
//    var arr1 = mutableListOf(5,4,3,2,1)
//    var arr2 = mutableListOf(10,20,30,40,50)
//    for (elementArr2 in arr2){
//        for (elementArr1 in arr1) {
//            println(elementArr2 * elementArr1)
//        }
//    }
//    var arr1 = mutableListOf(5,4,3,2,1)
//    var arr2 = mutableListOf(10,20,30,40,50)
//    loop1@ for (elementArr2 in arr2){
//        println("Vòng lặp 1: $elementArr2")
//        loop2@ for (elementArr1 in arr1) {
//            println("Vòng lặp 2: $elementArr1")
//            break@loop1
//        }
//    }
//    var arr1 = mutableListOf(5,4,3,2,1)
//    var arr2 = mutableListOf(10,20,30,40,50)
//    for ((index,item) in arr1.withIndex()){
//        if (index ==0){
//            continue
//        }
//        println(item)
//    }
//    var count = Random.nextInt(10)
//    while (count %2 ==0){
//        println(count)
//        count = Random.nextInt(100)
//    }
//    showMessage("Hello")
//
//}
//
//fun showMessage(message: String) {
//    println(message)
//
//    var cat = Animal("Kity","1.2 Kg")
////    cat.name = "Kity"
////    cat.weight = "1.2 Kg"
//
//    var cat2 = Animal("Doremon", "0.5 Kg")
////    cat.name = "Doremon"
////    cat.weight = "0.5 Kg"
//    cat.printInfo()
//    cat2.printInfo()
//    println("Name: ${cat.name}, weight: ${cat.weight}")
//    println("Name: ${cat2.name}, weight: ${cat2.weight}")

    // Tinh dong goi: The hien viec cac thong tin cua doi tuong nen su dung qua cac
    // phuong thuc getter va setter de truy cap

    // Tinh ke thua: Nâng cấp các chức năng mới

        var cat1 = Cat("Kity","1.2 Kg","White")
        cat1.printInfo()

    // Tính đa hình

//    var cat1 = Cat("Kity","1.2 Kg","White")
//    cat1.printInfo()
    //    Tính trượu tượng
    var pizzaStore = PizzaStore()
    pizzaStore.orderPizza(PizzaCheese())
}





import sun.plugin2.message.Message
import kotlin.random.Random

fun main(args: Array<String>) {
//        println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//        println("Program arguments: ${args.joinToString()}")

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
    showMessage("Hello")

}

fun showMessage(message: String) {
    println(message)
}

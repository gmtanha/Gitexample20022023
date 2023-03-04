fun main(args: Array<String>) {
    //     dấu // là comment
    //    1: khai báo biến
    //    mutable, immutable
    //    Từ báo khai biến là var

    //    var name = "Phạm Tấn Phát"
    //    name = "Phạm Tấn Phát 1"
    //    print(name)
    // Từ khóa khai báo val
    //    val pi = 3.14
    //    val address = "199 Lý Thường Kiệt"
    //    // 2: Kiểu dữ liệu
    //    // kiểu String: Chuổi
    //    var text: String = "Hello"
    //    // kiểu sồ nguyên: Int, Long
    //    var age: Int = 29
    //    // Kiểu số thực: Float
    //    var weight: Float = 74.9f

    //    var number1 = 5
    //    var number2 = 10
    //    var result = number1 + number2

    //    number1 = number1 + 1
    //    number1 += 1
    //    ++number1
    //    number1++
    //    Dấu + mà xử lý với chuổi thì mang tính chất là phép nối chuổi
    //    var number1 = 5
    //    var number2 = number1++
    //    var number3 = ++number1

    //    Toán tử variable++
    //    Thực hiện phép gán
    //    Thực hiện tăng giá trị variable lên thêm 1

    //    print("Number2 : $number2")
    //    print("Number3 : $number3")
    //    var number1 = 5
    //    var number2 = 7
    //    var result = ++number1 - --number2 + number1++ - number2++ + number2--
    //    // 6 - --number2 + number1++ - number2++ + number2--; a + 6, b = 7
    //    // 6 - 6 + number1++ - number2++ + number2--; a = 6, b = 6
    //    // 6 - 6 + 6 - number2++ + number2--; a = 7, b = 6
    //    // 6 - 6 + 6 - 6 + number2--; a = 7, b = 7
    //    // 6 - 6 + 6 - 6 + 7; a = 7, b = 6
    //
    //    // number1 = 7, number2 = 6, result = 7
    //
    ////    var result = ++number1 - --number2 + number1++ + number2++ + number2--
    //    println("Number1: $number1")
    //    println("Number2: $number2")
    //    println("Result: $result")
    //    var weight = 74.5f
    //    var height =1.75f
    //    if(weight/(height*height)<18.5){
    //        print("gầy")
    //    } else if(weight/(height*height)<24.9){
    //        print("Bình thường")
    //    }else if(weight/(height*height)<29.9){
    //        print("Hơi béo")
    //    }else if(weight/(height*height)<34.9){
    //        print("Béo phì cấp độ 1")
    //    }else if(weight/(height*height)<39.9){
    //        print("Béo phì cấp độ 2")
    //    }else if(weight/(height*height)<40){
    //        print("Béo phì cấp độ 3")
    //    }

    ////  var y:Double=8.5
    //    var z = 10.75
    //    println("kiểu loại của y là: " + (y::class.java.typeName))
    //    println("kiểu loại của z là: " + (z::class.java.typeName))
    //    println("\t \t Hôm nay học buổi 2 +\n Mai học buổi 3")
    //    var a = 10
    //    var b =3
    //    println(a::class.java.typeName)
    //    println("cách 1 a+b= " + (a+b))
    //    println("cách 2 a+b= " + (a.plus(b)))
    //
    //    println("cách 1 a/b= " + (a/b))
    //    println("cách 2 a/b= " + (a.div(b)))
    //    var kq:Float = a.toFloat()/b
    //    println("a/b = " +kq)
    //
    //    println("cách 1 a%b= " + (a%b))
    //    println("cách 2 a%b= " + (a.rem(b)))
    //    var x:Float = 9.2f
    //    var y= x.unaryMinus()
    //    println("x= $x")
    //    println("y= $y")
    //    var z=y.unaryMinus()
    //    println("z= $z")
    //    var i1=2
    //    var i2=5
    //    var i3=-3
    //    var d1=2.0
    //    var d2=5.0
    //    var d3=-0.5
    //    var result= i1+(i2*i3)
    //    println("Result= $result")
    //    var result1= i1+(i2+i3)
    //    println("Result1= $result1")
    //    var result2= i1/(i2+i3)
    //    println("Result2= $result2")
    //    var result3= i1/i2+i3
    //    var
    //    println("Result3= $result3")

    //    var weight: Float = 74.5f
    //    var height: Float = 1.75f
    //
    //    var bmi = weight / (height * height)
    //    var message: String
    //
    //    var maxValueThin = 18.5f
    //    var maxValueNormal = 24.9f
    //    var maxValueLittleOverWeight = 29.9f
    //    var maxValueFatLevel1 = 34.9f
    //    var maxValueFatLeve2 = 39.9f
    //
    //    if (bmi < maxValueThin){
    //        message = "Gầy"
    //    } else if (bmi < maxValueNormal){
    //        message = "Bình thường"
    //    }else if (bmi < maxValueLittleOverWeight){
    //        message = "Hơi béo"
    //    } else if (bmi < maxValueFatLevel1){
    //        message = "Béo phì cấp độ 1"
    //    } else if (bmi < maxValueFatLeve2){
    //        message = "Béo phì cấp độ 2"
    //    } else {
    //        message = "Béo phì cấp độ 3"
    //    }
    //
    //    println("Chỉ số cơ thể: $bmi")
    //    println("Tình trạng sức khỏe: $message")

    // In
    // Chỉ số cơ thể: ?
    // Tình trạng sức khỏe: ?
    //    var isMale = true
    //    var message: String = if (isMale){
    //        "Đàn ông"
    //    }else if(!isMale){
    //        "abc"
    //    }else{
    //        "Đàn bà"
    //    }
    //    var account = "a"
    //    var password = "a"
    //
    //    if (account.length == 0 || password.length == 0)
    //    {
    //        print(" chưa truyền đủ thông tin để xử lý")
    //    }
    //    var month = 6
    //    var message = when (month) {
    //        in 1..3 -> "Quý 1"
    //        in 4..6 -> "Quý 2"
    //        in 7..9 -> "Quý 3"
    //        in 10..12 -> "Quý 4"
    //    else-> "không thuộc quý nào"
    //    }
    //    println(message)
    //                var arrNumbers = mutableListOf<Int>(1, 3, 5, 7, 9)
    //            //
    //            //    // Thêm dữ liệu vào mảng
    //            ////    arrNumbers.add(11)
    //            //
    //            //    // In giá trị phần tử đầu tiên
    //                println("Giá trị phần tử đầu tiên: ${arrNumbers[0]}")
    //            //
    //            //    // In giá trị phần tử cuối cùng
    //                println("Giá trị phần tử cuối cùng: ${arrNumbers[arrNumbers.size - 1]}")
    //            //
    //    // Xóa phần tử trong mảng
    //    arrNumbers.removeAt(0)

    // Sửa giá trị
    //    arrNumbers[0] = 11
    //    print(arrNumbers[0])
//                    for ((index,item) in (1..10 step 2).withIndex()){
//                        println(index)
//                    }
//                var count = Random.nextInt(10)
//
//                while (count % 2 == 0) {
//                    println(count)
//                    count = Random.nextInt(100)
//                }
//                var arr1 = mutableListOf(5, 4, 3, 2, 1)
//                var arr2 = mutableListOf(10, 20, 30, 40, 50)
//
//                loop1@ for (elementArr2 in arr2) {
//                    println("Vòng lặp 1: $elementArr2")
//                    loop2@ for (elementArr1 in arr1) {
//                        println("Vòng lặp 2: $elementArr1")
//                        break@loop2
//
//                    }
//                }
//                    var arr1 = mutableListOf(5, 4, 3, 2, 1)
//                    var arr2 = mutableListOf(10, 20, 30, 40, 50)
//
//                    for ((index, item) in arr1.withIndex()) {
//                        if (index == 0) {
//                            continue
//                        }
//                        println(item)
//                    }

//

//    showMessage("Hello")
//    }
//    fun showMessage(message: String){
//        println(message)
//    }
    var weight: Float = 74.8f
    var height: Float = 1.75f
    var bmi = weight / (height * height)
    var message: String = ""
    var maxValueThin = 18.4f
    var maxValueNormal = 24.9f
    var maxValueLittleOverWeight = 29.9f
    var maxValueFatLevel1 = 34.9f
    var maxValueFatlevel2 = 39.9f
    if (bmi < maxValueThin) {
        message = "Gầy"
    } else if (bmi < maxValueNormal) {
        message = "Bình thường"
    } else if (bmi < maxValueLittleOverWeight) {
        message = "Hơi béo"
    } else if (bmi < maxValueFatLevel1) {
        message = "Béo cấp độ 1"
    } else if (bmi < maxValueFatlevel2) {
        message = "Béo cấp độ 2"

    } else
        message = "Béo cấp độ 3"

    println("Chỉ số cơ thể: $bmi")
    println("Tình trạng sức khỏe: $message")
    }
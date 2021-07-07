fun main(args: Array<String>) {
    println("Hello World")
    println("My first Kotlin program")

    var name: String
    name = "Manikanta"
    println(name)

    var a: Int = 32
    var monthly: Int = a * 4
    println(a)
    println(monthly)
    var Num = 2
    println(Num)
//    Variables should start with lowercase letters in Kotlin
//    Class names should start with UpperCase Letters in Kotlin

    val num1: Int = 6
    val num2: Int = 5
    var answer: Int = num1 - num1
    println(answer)

    println(num1 / 4)
    println()
    val weeks: Int = 130
    val years: Double = weeks / 52.0
    println(years)
//    instead of concatenation of strings we can also use
//    interpolation in kotlin $ symbol in order to print anything

    println("My name is $name")
//    var is variable
//    val is const, cannot change its value afterwards

    val aa:Int= 10
//    aa = 12 gives error

//        difference between print and printLine is
//    Print will display all the contents in the same line
//    Println displays in the new line as follows
    print("1234")
    print("10 11 12")
    print("Using Print statement ------------")

    println()
    println("1234")
    println("10 11 12")
    println("Using println--------------")
}

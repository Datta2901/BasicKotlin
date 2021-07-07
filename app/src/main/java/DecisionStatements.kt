fun main(args:Array<String>){
    print("Enter your age")
    val age:Int = readLine()!!.toInt()
    println("Your Age is $age")

    // normal decision statements in other languages
    // it also supports if else
    // additional to that we can also write using when
    if(age < 18){
        println("you are not eligible to vote")
    }else if(age == 50){
        println("nothing")
    }else{
        println("You are eligible to vote")
    }

//    using when
    when {
        age < 18 -> println("you are not eligible to vote")
        // single line means no need to use '{'
        age == 50 -> {
            println("nothing")
        }
        // if we want to use multiple line we use {
        else -> {
            println("You are eligible to vote")
        }
    }

//    we can also assign the result to variables
    val message : String = when {
        age < 18 -> "you are not eligible to vote"
        // single line means no need to use '{'
        age == 50 -> {
            "nothing"
            "Your age is 50"
        }
        // if we want to use multiple line we use {
        else -> {
            "You are eligible to vote"
        }
    }
    println("$message")

}

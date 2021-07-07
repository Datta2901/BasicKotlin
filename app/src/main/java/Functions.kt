// Complete Function
                //args    //return type
fun generateAnswerString(): String {
    val count : Int = 43
    val answerString = if (count == 42) {
        "I have the answer."
    } else {
        "The answer eludes me"
    }
    return answerString
}

// Simplifying function declarations
fun generateAnswerString(countThreshold: Int): String {
    val count :Int= 42
    return if (count > countThreshold) {
        "I have the answer."
    } else {
        "The answer eludes me."
    }
} 

// You can also replace the return keyword with the assignment operator:
// fun generateAnswerString(countThreshold: Int): String = if (count > countThreshold) {
//     "I have the answer"
// } else {
//     "The answer eludes me"
// }


// Anonymous functions
val stringLengthFunc: (String) -> Int = { input ->
   input.length
}

// Higher-order functions
fun stringMapper(str: String, mapper: (String) -> Int): Int {
    // Invoke function
    return mapper(str)
}

fun main(){
    println(generateAnswerString())
    println(generateAnswerString(12))
    println(stringLengthFunc("abcd"))
}
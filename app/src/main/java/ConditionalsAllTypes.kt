fun main(){
    var count: Int = 42

    // Ifelse
    if (count == 42) {
        println("I have the answer.")
    } else {
        println("The answer eludes me.")
    }

    // if elseif
    if (count == 42) {
        println("I have the answer.")
    } else if (count > 35) {
        println("The answer is close.")
    } else {
        println("The answer eludes me.")
    }

    // kotlin feature of storing them in a variable
    var answerString: String = if (count == 42) {
        "I have the answer."
    } else if (count > 35) {
        "The answer is close."
    } else {
        "The answer eludes me."
    }
    
    println(answerString)

    // using when
    answerString = when {
        count == 42 -> "I have the answer."
        count > 35 -> "The answer is close."
        else -> "The answer eludes me."
    }
    
    println(answerString)

    val languageName: String? = null
    if (languageName != null) {
        // No need to write languageName?.toUpperCase()
        println(languageName.toUpperCase())
    }else{
        println(languageName)
    }

}
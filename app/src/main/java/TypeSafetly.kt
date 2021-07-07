// Null safety
// print(
// """ Fails to compile
// val languageName: String = null
// """
// )

fun main(){
    print(
        """ Fails to compile
        val languageName: String = null 
        """
    )

    var languageName: String ?= null
    println(languageName)
}


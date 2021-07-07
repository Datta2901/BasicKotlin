//Class in kotlin

class Details(val name:String,var age:Int,var male:Boolean = true) {
     fun show(){
         println(
             """
             Name : $name
             age : $age
             male : $male
         """)
     }
}

class Player(val name: String, var level: Int = 1, var lives: Int = 3, var score: Int = 0) {
    var weapon: Weapon = Weapon("Fist", 1)
    fun show() {
        println("""
            name: $name
            lives: $lives
            level: $level
            score: $score
            weapon:${weapon.name}
            """)
    }
}

class Weapon(val name: String, var damageInflicted: Int) {

    override fun toString(): String {
        return "$name inflicts $damageInflicted points of damage"
    }

}
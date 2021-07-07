import ClassesRelatedExample.Player1

fun main(){
    val a = Details("Manikanta",18)
    a.show()
    var b = Details("abcd",12,false)
    b.show()
    val pavan = Player1("Pavan")
    pavan.show()

    val louise = Player1("Karthik", 5)
    louise.show()

    val gr8 = Player1("Harsha", 4, 8)
    val one2watch = Player1("Surya",2, 5, 1000)
    gr8.show()
    one2watch.show()

    println(one2watch.weapon.name.toUpperCase())
    println(one2watch.weapon.damageInflicted)

    val axe = Weapon("Axe", 12)
    gr8.weapon = axe
    println(gr8.weapon.name)
    println(axe.name)
    gr8.show()

    axe.damageInflicted = 24
    println(axe.damageInflicted)
    println(gr8.weapon.damageInflicted)


    pavan.weapon = Weapon("Sword", 10)
    println(pavan.weapon.name)

    pavan.weapon = Weapon("Spear", 14)
    println(pavan.weapon.name)
}
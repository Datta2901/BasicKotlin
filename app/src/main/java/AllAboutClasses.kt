// basic class
class Car {
    val wheels = listOf<Wheel>()
}

val car = Car() // construct a Car
val wheels = car.wheels // retrieve the wheels value from the Car


// to show encapsulation : combining methods and members
class Car(val wheels: List<Wheel>) {

    private val doorLock: DoorLock = ...

    fun unlockDoor(key: Key): Boolean {
        // Return true if key is valid for door lock, false otherwise
    }
}
fun main(){
   
    
}
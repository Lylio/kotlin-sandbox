package lights

class Lamp {

    private var isOn: Boolean = false

    fun turnOn() {
        isOn = true
    }

    fun turnOff() {
        isOn = false
    }

    fun lightStatus(lamp: String) {
        if (isOn == true)
            println("$lamp is on.")
        else
            println("$lamp is off.")
    }
}
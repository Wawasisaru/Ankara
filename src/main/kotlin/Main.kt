fun main() {
    val fabricPattern = Ankara("Dotted")
    fabricPattern.mood = "Happy"
    fabricPattern.temperature = 5
    println(fabricPattern.predictPatternChanges())

}


class Ankara(val fabric: String) {

    var mood: String = "None"
    var temperature: Int = 0

    fun predictPatternChanges(): String {
        if (mood == "Happy" && temperature > 30 || temperature<=30) {
            return "The $fabric fabric pattern will be bright."
        } else if (mood == "Sad" && temperature < 10 || temperature>=10) {
            return "The $fabric fabric pattern will be dark."
        } else if (mood == "Neutral" && temperature >= 10 && temperature <= 30) {
            return "The $fabric fabric pattern will remain the same."
        } else {
            return "Unable to predict pattern changes."
        }
    }
}
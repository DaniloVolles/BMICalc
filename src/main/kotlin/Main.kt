fun main() {

    println("Be very welcome to the BMI calculator!")

    // Presenting the program
    val menuText = "What do you want to do?\n" +
            "- 1 - Calculate BMI\n" +
            "- 0 - Terminate program"

    println(menuText)

    var menuOption = readln().toInt()
    while (menuOption != 0) {

        when (menuOption) {
            1 -> calculateBMI()
        }
        println(menuText)
        menuOption = readln().toInt()
    }

}

fun calculateBMI() {

    // Input data
    println("Insert your height in meters:")
    val height = readln().toDouble()
    println("Insert your weight in kilograms:")
    val weight = readln().toDouble()

    // Output data
    println("Your height is $height meters and your weight is $weight kilograms.")

    val bmi = bmiCalculation(height, weight)
    val result = bmiResult(bmi)

    println(result)

}

// Implementar menu
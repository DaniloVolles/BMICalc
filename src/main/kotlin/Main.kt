fun main() {

    // Presenting the program
    println("Be very welcome to the BMI calculator!\n" +
            "Please, insert the data when asked.")

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
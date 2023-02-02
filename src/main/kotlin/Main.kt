import java.util.Scanner

    val input = Scanner(System.`in`)

fun main() {


    // Presenting the program
    println("Be very welcome to the BMI calculator!\n" +
            "Please, insert the data when asked.")

    // Input data
    println("Insert your height in meters:")
    var height = input.nextDouble()
    println("Insert your weight in kilograms:")
    var weight = input.nextDouble()

    // Output data
    println("Your height is $height meters and your weight is $weight kilograms.")

    // BMI calculation
    var bmi = bmiCalculation(height, weight)
    var result = bmiResult(bmi)

    println(result)
}
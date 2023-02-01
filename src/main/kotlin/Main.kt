import java.util.Scanner

// Variable initialization
    private val input = Scanner(System.`in`)
    var height: Int = 0
    var weight: Int = 0

fun main() {

    // Presenting the program
    println("Be very welcome to the BMI calculator!\n" +
            "Please, insert the data when asked:\n")

    // Input data
    println("Insert your height in centimeters:")
    var height = input.nextInt()

    println("Insert your weight in kilograms:")
    var weight = input.nextInt()

    // Output data
    println("Your height is $height cm and your weight is $weight kg.")


}
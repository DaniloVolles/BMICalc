fun bmiCalculation(height: Double, weight: Double): Double {
    return weight / (height * height)
}

fun bmiResult (bmi: Double) {

    val initialText = "Your BMI index is $bmi and you are"

    if (bmi < 18.5) {
        println("$initialText underweight")
    } else if (bmi < 25) {
        println("$initialText normal weight")
    } else if (bmi < 30) {
        println("$initialText overweight")
    } else if (bmi < 35) {
        println("$initialText obese")
    } else {
        println("$initialText extremely obese")
    }

}
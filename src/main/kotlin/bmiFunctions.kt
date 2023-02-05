fun bmiCalculation(height: Double, weight: Double): Double {
    return weight / (height * height)
}

fun bmiResult (bmi: Double) {

    val sameText = "Your BMI index is $bmi and you are"

    if (bmi < 18.5) {
        println("$sameText underweight")
    } else if (bmi < 25) {
        println("$sameText normal weight")
    } else if (bmi < 30) {
        println("$sameText overweight")
    } else if (bmi < 35) {
        println("$sameText obese")
    } else {
        println("$sameText extremely obese")
    }

}
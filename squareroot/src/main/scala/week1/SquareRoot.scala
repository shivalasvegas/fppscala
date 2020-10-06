package week1

object SquareRoot extends App{
  def abs(x: Double) = if (x<0) -x else x
  def square(y: Double): Double = y*y

  def sqrtIter(guess: Double, x: Double): Double = {
    // if the answer is within error then return guess
    // Otherwise improve the guess
    if (isGoodEnough(guess, x)) guess
    else (sqrtIter(improve(guess, x), x))
  }
  // calculates an within an accepted error
  def isGoodEnough(guess: Double, x: Double) = {
    abs(square(guess) - x)/x < 0.0001
  }
  // Newton's method
  def improve(guess: Double, x: Double) =
    (guess + x / guess)/2
//to avoid name-space pollution the small functions: improve/isGoodEnough/sqrtIter are put inside the function sqrt
 // def sqrt(x: Double) = sqrtIter(1.0, x)
  val sqrtTest = 0.00001
  println(s"The square root of $sqrtTest = ${sqrt(sqrtTest)}")

}

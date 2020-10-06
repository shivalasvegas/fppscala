package week1

object SquareRoot extends App{
  
  def abs(x: Double) = if (x<0) -x else x
  def square(y: Double): Double = y*y

  def sqrt(x: Double): Double = {

    def sqrtIter(guess: Double): Double = {
    // if the answer is within error then return guess
    // Otherwise improve the guess
      if (isGoodEnough(guess) ) guess
      else (sqrtIter (improve (guess)) )
    }
    // calculates an within an accepted error
    def isGoodEnough(guess: Double) = {
      abs (square (guess) - x) / x < 0.0001
    }
    // Newton's method
    def improve(guess: Double): Double = {(guess + x / guess) / 2}

    sqrtIter(1.0)
    //to avoid name-space pollution the small functions: improve/isGoodEnough/sqrtIter are put inside the function sqrt
    // program is cleaner
    // this uses a block
    // def sqrt(x: Double) = sqrtIter(1.0, x)
  }
  val sqrtTest = 5
  println(s"The square root of $sqrtTest = ${sqrt(sqrtTest)}")

}

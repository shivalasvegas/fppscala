package week1
// design the factorial function so that it uses tail recursion
//def factorial(n: Int): Int = if (n==0) 1 else n*factorial(n-1)
object Factorial extends App{

  def factorialPrima(n: Int): Int = if (n==0) 1 else n*factorial(n-1)

  def recur(first: Int, second: Int) = first*second
  def factorial(n: Int): Int = {

    if (n==0) 1 else recur(n, factorial(n-1))
  }
  val x = 4
  println(s"factorialPrima: the factorial of $x is ${factorialPrima(x)}")
  println(s"factorial: the factorial of $x is ${factorial(x)}")

}

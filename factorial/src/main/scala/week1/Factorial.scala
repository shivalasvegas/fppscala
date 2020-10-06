package week1

import scala.annotation.tailrec

// design the factorial function so that it uses tail recursion
//def factorial(n: Int): Int = if (n==0) 1 else n*factorial(n-1)
object Factorial extends App{

  def factorialUna(n: Int): Int = if (n==0) 1 else n*factorialUna(n-1)

  def factorialDos(n: Int): Int = {
    @tailrec
    def loop(acc: Int, n: Int): Int = if (n==0) acc else loop(acc*n, n-1)
    loop(1, n)
  }
  
  val x = 4
  println(s"factorialPrima: the factorial of $x is ${factorialUna(x)}")
  println(s"factorial: the factorial of $x is ${factorialDos(x)}")

}

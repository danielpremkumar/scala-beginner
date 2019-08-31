package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(num: Int): BigInt = {
    if (num <= 1) 1
    else num * factorial(num - 1)
  }

  println(factorial(21))

  /*
  * Tail Recursion is used
  */
  def anotherFactorial(num: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator)
    }

    factHelper(num, 1)
  }

  println(anotherFactorial(5000))

  // Fibonacci Series

  // fibonacci Series without tail call
  def fibonacci(num: Int): Int = {
    if (num <= 2) 1
    else fibonacci(num - 1) + fibonacci(num - 2)
  }

  println(fibonacci(8))

  // fibonacci Series with tail recursion
  def fibonacciWithTailRec(num: Int): Int = {
    def fibHelper(count: Int,  last: Int, nextToLast: Int ): Int =
      if (count >= num) last
      else fibHelper(count + 1, last + nextToLast, last)

    fibHelper(1, 1, 0)
  }

  println(fibonacciWithTailRec(10))
  //1,1,2,3,5,8,13,21,34,55
  //1,2,3,4,5,6,7 ,8 ,9 ,10

  // Concatenate a String n times
  def stringConcat(name: String, num: Int): Unit = {
    @tailrec
    def concatHelper(name: String, accumulator: String, num: Int): Unit = {
      if (num <= 1) println(name + accumulator)
      else concatHelper(name, name + accumulator, num - 1)
    }

    concatHelper(name, "", num)
  }

  stringConcat("daniel", 6)

  // IsPrime Function tail recursive
  def isPrime(num: Int): Boolean = {
    @tailrec
    def isPrimeHelper(divisor: Int, result: Boolean): Boolean = {
      if (result) !result
      else if (divisor <= 1) true
      else isPrimeHelper(divisor - 1, num % divisor == 0)
    }

    if (num <= 3) true
    else isPrimeHelper(num / 2, num % (num / 2) == 0)
  }

  println(isPrime(31))
  println(isPrime(23))
  println(isPrime(5))
  println(isPrime(11))
  println(isPrime(1))
  println(isPrime(22))
  println(isPrime(2))
  println(isPrime(35))

}


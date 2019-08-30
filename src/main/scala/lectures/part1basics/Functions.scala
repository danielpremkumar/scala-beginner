package lectures.part1basics

import java.math.BigInteger

object Functions extends App {
  def afunction(a: String, b: Int): String =
    a  + " " + b

  def greeting(name: String, age: Int): Unit = {
    println(s"Hi, my name is $name and I am $age years old")
  }

  greeting("Daniel", 32)

  def factorial(num: Int):BigInt = {
    if(num == 1) num
    else num * factorial(num-1)
  }

  println(factorial(5))

  def fibonacci(num: Int): BigInt = {
    if (num <= 2) 1
    else fibonacci(num - 1) + fibonacci(num - 2)
  }
  // 1,1,2,3,5,8,13,21
  println(fibonacci(8))

  def isPrime(num: Int): Boolean = {
    BigInteger.valueOf(num).isProbablePrime(100)
  }

  println(isPrime(114))
}

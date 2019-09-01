package lectures.part1basics

import scala.annotation.tailrec

object DefaultArgs extends App {
  //Default value of the parameter can be specified
  @tailrec
  def tailRecFactorial(num: Int, acc: BigInt = 1): BigInt = {
    if (num <= 1) acc
    else tailRecFactorial(num - 1, acc * num)
  }

  val fact10 = tailRecFactorial(10, 1)

  def pictureFormat(format: String = "jpg", widht: Int  = 800, height: Int = 400): Unit = {

  }

  /*
   * Named Arguments can be used to send parameters in different order
   */
  pictureFormat(widht  = 1920, height = 1080, format = "bmp")
}

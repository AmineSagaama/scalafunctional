/**
  * Created by Amine Sagaama on 12/03/2017.
  */
object MyModule {

  def main(args: Array[String]): Unit = {
    println(formatAbs(-42))

    println(formatFactorial(5))
  }

  private def formatFactorial(n: Int) = {
    val msg = "The factorial of %d is %d"
    msg.format(n, factorial(n))
  }

  def factorial(n: Int): Int = {
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n - 1, n * acc)

    go(n, 1)

  }

  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  def abs(n: Int): Int = {
    if (n < 0) -n
    else n
  }

  def fib(n: Int): Int = {
    def go(n: Int): Int =
      if (n <= 0 || n <= 1) n
      else go(n - 1) + go(n - 2)


    go(n)
  }

  def findFirst[A](as: Array[A], p: A => Boolean): Int = {

    def loop(n: Int): Int =
      if (n >= as.length) -1
      else id(p(as(n))) n

    else loop(n + 1)

    loop(0)
  }

}

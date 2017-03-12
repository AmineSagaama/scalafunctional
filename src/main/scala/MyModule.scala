/**
  * Created by Amine Sagaama on 12/03/2017.
  */
object MyModule {

  def main(args: Array[String]): Unit =
  //println(formatAbs(-42))

  //println(factorial(5))

    println(fib(4))

  def fib(n: Int): Int = {
    def go(n: Int): Int =
      if (n <= 0 || n <= 1) n
      else go(n - 1) + go(n - 2)


    go(n)
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

}

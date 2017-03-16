/**
  * Created by Amine Sagaama on 12/03/2017.
  */
object MyModule {

  def main(args: Array[String]): Unit = {
    println(findFirst(Array(7, 9, 13), (x: Int) => x == 9))
    println(matchTest(5))
    println(matchTest2(10))
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
      else if (p(as(n))) n

      else loop(n + 1)

    loop(0)
  }

  def partial1[A, B, C](a: A, f: (A, B) => C): B => C =
    b => f(a, b)

  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "Two"
    case _ => "many"
  }

  def matchTest2(x: Any): Any = x match {
    case 1 => "one"
    case "two" => 2
    case y: Int => "Scala.int"
  }

}

import scala.annotation.tailrec

object TailRecursion extends App {
  @tailrec
  final def tailrecur(x: Int, i: Int): Int = {
    if (x ==0)
      i
    else
      tailrecur(x - 1, x * i)
  }
    println(tailrecur(6, 1))

}



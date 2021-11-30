import scala.io.StdIn

object IfElse extends App
{
  val a : Unit= {
    println("Enter the Integer value =")
    val a = StdIn.readLine().toInt
    if (a % 2 == 0) {
      println("The given number is Even number")
    }
    else {
      println("The given number is Odd number")
    }
  }
}

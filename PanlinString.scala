import scala.annotation.tailrec
import scala.io.StdIn

object PanlinString extends App
{

  @tailrec
  final def palinStr(str: String): String = {
    if (str.length == 0 || str.length == 1)
      "The String is a palindrome"
    else
      if(str.charAt(0) == str.charAt(str.length - 1))
        palinStr(str.substring(1,str.length -1 ))
      else
        "The String is not a palindrome"
  }
  println("Enter the String value =")
  val str = StdIn.readLine()
  println(palinStr(str))


}

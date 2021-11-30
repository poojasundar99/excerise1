import scala.annotation.tailrec

object Fibonacci extends App
{
  @tailrec
  final def fib(aa:Int, fistTerm:Int, secondTerm:Int, index:Int):Int =
    {
      if(index==aa)  secondTerm
      else fib(aa,secondTerm,fistTerm+secondTerm,index+1)
    }
    println(fib(aa=10,fistTerm = 0, secondTerm = 1,index = 1))
}


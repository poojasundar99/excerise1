import scala.annotation.tailrec

object AddSequence extends App
{
  final def addSeq (i:Int):Int=
  {
    @tailrec
    def add2(i:Int, last:Int, sum:Int):Int= {
      if (i > last) sum
      else add2(i + 1, last, sum + i)
    }
    add2(i,last = 10,sum = 0)
      }
    println(addSeq(i=5))
  }




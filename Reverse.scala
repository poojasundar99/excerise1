import scala.annotation.tailrec

object Reverse extends App
{
  final def reverse(r:String) :String=
    {
      @tailrec
      def rev(r: String, len:Int, store:String):String=
      {
        if(len < 0)
          store
        else rev(r,len-1,store+r.charAt(len))

      }
      rev(r,r.length-1,store="")
    }
    println(reverse(r="RACECAR"))

}


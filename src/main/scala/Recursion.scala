object Recursion extends App
{
  def fac(a : Int):Int= {
    if (a == 0)
      1
    else
      a * fac(a - 1)
  }
  print(fac(9))
}



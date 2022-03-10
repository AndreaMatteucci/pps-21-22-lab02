package u02

object Es3 extends App:

  //es A
  //Con Val
  val f1: Int=>String = i => i match //Invece di i=>i avrei potuto usare _
    case x if x%2==0 => "even"
    case _ => "odd"
  println(f1(2))
  //Con Def
  def parity(x: Int): String = x match
    case x if x%2==0  => "even"
    case _ => "odd"
  println(parity(2))

  //es B
  def neg(x: String => Boolean): (String => Boolean) =
    (e:String) => !x(e)
  //val empty: String => Boolean = _ == "" // predicate on strings
  def empty[A](x:A):Boolean = x == ""
  //val notEmpty = neg(empty) // which type of notEmpty?
  def notEmpty = neg2(empty)
  println(notEmpty("foo")) // true
  println(notEmpty("")) // false
  println(notEmpty("foo") && !notEmpty("")) // true.. a comprehensive test

  //es C
  def neg2[A](x:A=>Boolean):(A => Boolean) =
    (e:A) => !x(e)



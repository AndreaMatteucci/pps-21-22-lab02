package u02

object Es8:

  enum Option[A]:
    case Some(a:A)
    case None()

  object Option:
    def filter[A](option: Option[A])(f: A => Boolean): Option[A] = option match
      case Some(a) if f(a)=>Some(a)
      case Some(a) if !f(a)=>None()
      case None() => None()

    def map[A](option: Option[A])(f: A => Boolean): Option[Boolean] = option match
      case Some(a) if f(a)=>Some(true)
      case Some(a) if !f(a)=>Some(false)
      case None() => None()

    def map2[A,B](a: Option[A])(b: Option[B]): Option[A] = a match
      case Some(a: A) if a!=None() && b!=None => Some(a) 
      case _ => None()





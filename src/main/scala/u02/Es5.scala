package u02

object Es5:

  def compose(f: Int => Int, g: Int => Int): Int => Int =
    e => f(g(e))

  def genericCompose[A,B,C](f:B => C, g:A => B): A => C =
    e => f(g(e))

  




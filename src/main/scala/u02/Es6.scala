package u02

object Es6:
  def fib(n: Int): Int = n match
      case 0 => n
      case 1 => n+fib(0)
      case _ => fib(n-2) + fib(n-1)

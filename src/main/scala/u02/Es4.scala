package u02

object Es4 extends App:

  val p1: Int => Int => Int => Boolean = x => y => z => x match
    case x if (x<y) && (y<z) => true
    case _ => false

  val p2: (Int, Int, Int) => Boolean = (x,y,z) => x match
    case x if (x<y) && (y<z) => true
    case _ => false

  def p3(x: Int)(y: Int)(z: Int): Boolean = (x<=y) && (y<=z)

  def p4(x: Int, y:Int, z:Int) : Boolean = (x<=y) && (y<=z)
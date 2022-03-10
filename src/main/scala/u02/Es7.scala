package u02


object Es7 extends App:

  enum Shape:
    case Rectangle(base: Double, height: Double)
    case Circle(radious: Double)
    case Square(l: Double)

  object Shape:
    def perimeter(shape: Shape): Double = shape match
      case Shape.Rectangle(b, h) => b+b+h+h
      case Shape.Circle(r) => 2 * Math.PI * r
      case Shape.Square(l) => 4*l

    def area(shape: Shape): Double = shape match
      case Shape.Rectangle(b,h) => b*h
      case Shape.Circle(r) => Math.PI * r * r
      case Shape.Square(l) => l*l




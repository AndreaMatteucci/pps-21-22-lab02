package u02

import org.junit.*
import org.junit.Assert.*

class TestEs7:

  val es_7 = Es7

  //Perimeters
  @Test def testRectanglePerimeter() =
  assertEquals(14, es_7.Shape.perimeter(es_7.Shape.Rectangle(3,4)), 0.01)

  @Test def testCirclePerimeter() =
    assertEquals(18.85, es_7.Shape.perimeter(es_7.Shape.Circle(3)), 0.01)

  @Test def testSquarePerimeter() =
    assertEquals(12, es_7.Shape.perimeter(es_7.Shape.Square(3)), 0.01)

  //Areas
  @Test def testRectanglArea() =
    assertEquals(12, es_7.Shape.area(es_7.Shape.Rectangle(3,4)), 0.01)

  @Test def testCircleAreas() =
    assertEquals(28.27, es_7.Shape.area(es_7.Shape.Circle(3)), 0.01)

  @Test def testSquareAreas() =
    assertEquals(9, es_7.Shape.area(es_7.Shape.Square(3)), 0.01)



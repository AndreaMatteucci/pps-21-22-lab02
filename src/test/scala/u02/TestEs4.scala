package u02
import org.junit.*
import org.junit.Assert.*


class TestEs4:

  val es_4= Es4

  @Test def testEs4_p1() =
    assertTrue(es_4.p1(1)(2)(3))

  @Test def testEs4_p2() =
    assertTrue(es_4.p2(1,2,3))

  @Test def testEs4_p3() =
    assertTrue(es_4.p3(1)(2)(3))

  @Test def testEs4_p4() =
    assertTrue(es_4.p4(1,2,3))





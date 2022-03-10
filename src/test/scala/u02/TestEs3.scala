package u02
import org.junit.*
import org.junit.Assert.*


class TestEs3:

  val es_3= Es3

  @Test def testEs3() =
    assertTrue(es_3.notEmpty("foo"))

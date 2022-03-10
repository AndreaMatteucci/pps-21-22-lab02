package u02

import org.junit.*
import org.junit.Assert.*

class TestEs5 extends App:

  val es_5 = Es5

  @Test def testCompose() =
    assertEquals(9, es_5.compose(_-1, _*2)(5))

  @Test def testGenericCompose() =
    assertEquals(9, es_5.genericCompose[Int, Int, Int](_-1, _*2)(5)) //C'è qualche vincolo da aggiungere?
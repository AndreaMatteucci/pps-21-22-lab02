package u02

import org.junit.*
import org.junit.Assert.*

class TestEs8:

  val es_8 = Es8

  @Test def testFilter() =
    assertEquals(es_8.Option.Some(5), es_8.Option.filter[Int](es_8.Option.Some(5))(_>2))
    assertEquals(es_8.Option.None(), es_8.Option.filter[Int](es_8.Option.Some(5))(_>8))
    assertEquals(es_8.Option.None(), es_8.Option.filter[Int](es_8.Option.None[Int]())(_>2))

  @Test def testMap() =
    assertEquals(es_8.Option.Some(true), es_8.Option.map[Int](es_8.Option.Some(5))(_>2))
    assertEquals(es_8.Option.Some(false), es_8.Option.map[Int](es_8.Option.Some(5))(_>8))
    assertEquals(es_8.Option.None(), es_8.Option.map[Int](es_8.Option.None[Int]())(_>2))

  @Test def testMap2()=
    assertEquals(es_8.Option.Some(1), es_8.Option.map2[Int, String](es_8.Option.Some(1))(es_8.Option.Some("test")))
    assertEquals(es_8.Option.Some(1), es_8.Option.map2[Int, String](es_8.Option.Some(1))(es_8.Option.Some("test")))
    assertEquals(es_8.Option.None(), es_8.Option.map2[Int, String](es_8.Option.None())(es_8.Option.Some("test")))


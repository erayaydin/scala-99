package in.yayd.era.s99

import P08._

class P08Test extends munit.FunSuite {
  private val list = List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e").map(Symbol(_))
  private val expected = List("a", "b", "c", "a", "d", "e").map(Symbol(_))

  test("Compress test with populated list, recursive method") {
    assertEquals(compressRecursive(list), expected)
  }

  test("Compress test with populated list, tail recursive method") {
    assertEquals(compressTail(list), expected)
  }

  test("Compress test with populated list, functional method") {
    assertEquals(compress(list), expected)
  }
}

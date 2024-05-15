package in.yayd.era.s99

import P16._

class P16Test extends munit.FunSuite {
  private val list =
    List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k").map(Symbol(_))
  private val expected =
    List("a", "b", "d", "e", "g", "h", "j", "k").map(Symbol(_))

  test("drop with recursive method") {
    assertEquals(dropRecursive(3, list), expected)
  }

  test("drop with tail recursive method") {
    assertEquals(dropTail(3, list), expected)
  }

  test("drop with functional way") {
    assertEquals(drop(3, list), expected)
  }
}

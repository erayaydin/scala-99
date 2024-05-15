package in.yayd.era.s99

import P14.duplicate

class P14Test extends munit.FunSuite {
  private val list = List("a", "b", "c", "c", "d").map(Symbol(_))
  private val expected =
    List("a", "a", "b", "b", "c", "c", "c", "c", "d", "d").map(Symbol(_))

  test("duplicate test") {
    assertEquals(duplicate(list), expected)
  }
}

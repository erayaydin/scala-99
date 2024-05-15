package in.yayd.era.s99

import P13.encodeDirect

class P13Test extends munit.FunSuite {
  private val list =
    List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e")
      .map(Symbol(_))
  private val expected: List[(Int, Symbol)] =
    List((4, "a"), (1, "b"), (2, "c"), (2, "a"), (1, "d"), (4, "e"))
      .map(t => (t._1, Symbol(t._2)))

  test("encode direct with populated list") {
    assertEquals(encodeDirect(list), expected)
  }

  test("encode direct with empty list") {
    assertEquals(encodeDirect(List()), Nil)
  }
}

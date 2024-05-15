package in.yayd.era.s99

import P26.combinations

class P26Test extends munit.FunSuite {
  private val list = List("a", "b", "c", "d", "e", "f").map(Symbol(_))
  private val expected = List(
    List("a", "b", "c"),
    List("a", "b", "d"),
    List("a", "b", "e"),
    List("a", "b", "f"),
    List("a", "c", "d"),
    List("a", "c", "e"),
    List("a", "c", "f"),
    List("a", "d", "e"),
    List("a", "d", "f"),
    List("a", "e", "f"),
    List("b", "c", "d"),
    List("b", "c", "e"),
    List("b", "c", "f"),
    List("b", "d", "e"),
    List("b", "d", "f"),
    List("b", "e", "f"),
    List("c", "d", "e"),
    List("c", "d", "f"),
    List("c", "e", "f"),
    List("d", "e", "f")
  ).map(_.map(Symbol(_)))

  test("combination test") {
    assertEquals(combinations(3, list), expected)
  }

  test("combination test with same size") {
    assertEquals(combinations(list.length, list), List(list))
  }

  test("combination test with zero size") {
    assertEquals(combinations(0, list), List(Nil))
  }
}

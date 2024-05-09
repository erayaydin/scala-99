package in.yayd.era.s99

import P09._

class P09Test extends munit.FunSuite {
  private val list =
    List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e")
      .map(Symbol(_))
  private val expected = List(
    List("a", "a", "a", "a"),
    List("b"),
    List("c", "c"),
    List("a", "a"),
    List("d"),
    List("e", "e", "e", "e")
  )
    .map(l => l.map(Symbol(_)))

  test("Pack test with populated list") {
    assertEquals(pack(list), expected)
  }

  test("Pack test with empty list") {
    assertEquals(pack(List()), List(List()))
  }
}

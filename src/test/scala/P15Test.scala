package in.yayd.era.s99

import P15.duplicateN

class P15Test extends munit.FunSuite {
  private val list = List("a", "b", "c", "c", "d").map(Symbol(_))
  private val expected =
    List(
      "a",
      "a",
      "a",
      "b",
      "b",
      "b",
      "c",
      "c",
      "c",
      "c",
      "c",
      "c",
      "d",
      "d",
      "d"
    ).map(Symbol(_))

  test("duplicate 3 times test") {
    assertEquals(duplicateN(3, list), expected)
  }
}

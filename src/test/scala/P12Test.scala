package in.yayd.era.s99

import P12.decode

class P12Test extends munit.FunSuite {
  private val list = List(
    (4, Symbol("a")),
    (1, Symbol("b")),
    (2, Symbol("c")),
    (2, Symbol("a")),
    (1, Symbol("d")),
    (4, Symbol("e"))
  )
  private val expected = List(
    "a",
    "a",
    "a",
    "a",
    "b",
    "c",
    "c",
    "a",
    "a",
    "d",
    "e",
    "e",
    "e",
    "e"
  ).map(Symbol(_))

  test("decode test") {
    assertEquals(decode(list), expected)
  }
}

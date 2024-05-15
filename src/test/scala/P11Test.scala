package in.yayd.era.s99

import P11._

class P11Test extends munit.FunSuite {
  private val list =
    List("a", "a", "a", "a", "b", "c", "c", "a", "a", "d", "e", "e", "e", "e")
      .map(Symbol(_))
  private val expected: List[Either[Symbol, (Int, Symbol)]] =
    List(
      Right((4, Symbol("a"))),
      Left(Symbol("b")),
      Right((2, Symbol("c"))),
      Right((2, Symbol("a"))),
      Left(Symbol("d")),
      Right((4, Symbol("e")))
    )

  test("Encode modified test") {
    assertEquals(encodeModified(list), expected)
  }

  test("Encode modified test with only pack") {
    assertEquals(encodeModifiedWithPack(list), expected)
  }
}

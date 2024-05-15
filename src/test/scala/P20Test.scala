package in.yayd.era.s99

import P20._

class P20Test extends munit.FunSuite {
  private val list = List("a", "b", "c", "d").map(Symbol(_))
  private val expected = (List("a", "c", "d").map(Symbol(_)), Symbol("b"))

  test("remove at with builtin") {
    assertEquals(removeAtBuiltin(1, list), expected)
  }

  test("remove at test") {
    assertEquals(removeAt(1, list), expected)
  }
}

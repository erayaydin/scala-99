package in.yayd.era.s99

import P22._

class P22Test extends munit.FunSuite {
  private val expected = List(4, 5, 6, 7, 8, 9)

  test("range with builtin way") {
    assertEquals(rangeBuiltin(4, 9), expected)
  }

  test("range with recursive") {
    assertEquals(rangeRecursive(4, 9), expected)
  }

  test("range with tail recursive") {
    assertEquals(rangeTail(4, 9), expected)
  }

  test("range with functional way") {
    assertEquals(range(4, 9), expected)
  }
}

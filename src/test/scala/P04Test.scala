package in.yayd.era.s99

import P04._

class P04Test extends munit.FunSuite {
  private val list = List(1, 1, 2, 3, 5, 8)

  test("Get length of list with builtin method") {
    assertEquals(lengthBuiltin(list), 6)
  }

  test("Get length of empty list with builtin method") {
    assertEquals(lengthBuiltin(List()), 0)
  }

  test("Get length of list with manual method") {
    assertEquals(length(list), 6)
  }

  test("Get length of empty list with builtin method") {
    assertEquals(length(List()), 0)
  }
}

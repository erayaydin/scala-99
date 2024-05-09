package in.yayd.era.s99

import P05._

class P05Test extends munit.FunSuite {
  private val list = List(1, 1, 2, 3, 5, 8)
  private val reversed = List(8, 5, 3, 2, 1, 1)

  test("Get reverse of the list with builtin method") {
    assertEquals(reverseBuiltin(list), reversed)
  }

  test("Get reverse of an empty list with builtin method") {
    assertEquals(reverseBuiltin(List()), List())
  }

  test("Get reverse of the list with simple method") {
    assertEquals(reverseSimple(list), reversed)
  }

  test("Get reverse of an empty list with simple method") {
    assertEquals(reverseSimple(List()), List())
  }

  test("Get reverse of the list with tail recursive method") {
    assertEquals(reverseTail(list), reversed)
  }

  test("Get reverse of an empty list with tail recursive method") {
    assertEquals(reverseTail(List()), List())
  }

  test("Get reverse of the list with functional method") {
    assertEquals(reverse(list), reversed)
  }

  test("Get reverse of an empty list with functional method") {
    assertEquals(reverse(List()), List())
  }
}

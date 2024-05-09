package in.yayd.era.s99

import P01._

class P01Test extends munit.FunSuite {
  private val list = List(1, 1, 2, 3, 5, 8)

  test("Get last element with builtin method") {
    assertEquals(lastBuiltin(list), 8)
  }

  test("Throw no such element exception on empty list with builtin method") {
    intercept[NoSuchElementException] {
      lastBuiltin(List())
    }
  }

  test("Get last element manually") {
    assertEquals(last(list), 8)
  }

  test("Throw no such element exception on empty list with manual") {
    intercept[NoSuchElementException] {
      last(List())
    }
  }
}

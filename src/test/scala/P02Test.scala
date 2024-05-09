package in.yayd.era.s99

import P02._

class P02Test extends munit.FunSuite {
  private val list = List(1, 1, 2, 3, 5, 8)

  test("Get last but one element with builtin method") {
    assertEquals(penultimateBuiltin(list), 5)
  }

  test("Throw no such element exception on empty list with builtin method") {
    intercept[NoSuchElementException] {
      penultimateBuiltin(List())
    }
  }

  test(
    "Throw no such element exception on single element list with builtin method"
  ) {
    intercept[NoSuchElementException] {
      penultimateBuiltin(List(1))
    }
  }

  test("Get last but one element manually") {
    assertEquals(penultimate(list), 5)
  }

  test("Throw no such element exception on empty list with manual method") {
    intercept[NoSuchElementException] {
      penultimate(List())
    }
  }

  test(
    "Throw no such element exception on single element list with manual method"
  ) {
    intercept[NoSuchElementException] {
      penultimate(List(1))
    }
  }
}

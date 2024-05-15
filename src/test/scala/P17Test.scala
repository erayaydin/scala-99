package in.yayd.era.s99

import P17._

class P17Test extends munit.FunSuite {
  private val list =
    List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k").map(Symbol(_))
  private val expected = (
    List("a", "b", "c").map(Symbol(_)),
    List("d", "e", "f", "g", "h", "i", "j", "k").map(Symbol(_))
  )

  private val lowList = List("a", "b").map(Symbol(_))

  test("split list with builtin") {
    assertEquals(splitBuiltin(3, list), expected)
  }

  test("split empty list with builtin") {
    assertEquals(splitBuiltin(3, List()), (Nil, Nil))
  }

  test("split low populated list with builtin") {
    assertEquals(splitBuiltin(3, lowList), (lowList, Nil))
  }

  test("split list with recursive") {
    assertEquals(splitRecursive(3, list), expected)
  }

  test("split empty list with recursive") {
    assertEquals(splitRecursive(3, List()), (Nil, Nil))
  }

  test("split low populated list with recursive") {
    assertEquals(splitRecursive(3, lowList), (lowList, Nil))
  }

  test("split list with tail recursive") {
    assertEquals(splitTail(3, list), expected)
  }

  test("split empty list with tail recursive") {
    assertEquals(splitTail(3, List()), (Nil, Nil))
  }

  test("split low populated list with tail recursive") {
    assertEquals(splitTail(3, lowList), (lowList, Nil))
  }

  test("split list test with functional way") {
    assertEquals(split(3, list), expected)
  }

  test("split empty list with functional way") {
    assertEquals(split(3, List()), (Nil, Nil))
  }

  test("split low populated list with functional way") {
    assertEquals(split(3, lowList), (lowList, Nil))
  }
}

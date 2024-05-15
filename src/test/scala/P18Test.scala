package in.yayd.era.s99

import P18._

class P18Test extends munit.FunSuite {
  private val list =
    List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k").map(Symbol(_))
  private val expected = List("d", "e", "f", "g").map(Symbol(_))

  private val lowList = List("a", "b").map(Symbol(_))
  private val lowExpected = List(Symbol("b"))

  test("slice list with builtin") {
    assertEquals(sliceBuiltin(3, 7, list), expected)
  }

  test("slice empty list with builtin") {
    assertEquals(sliceBuiltin(3, 7, List()), List())
  }

  test("slice low populated list with builtin") {
    assertEquals(sliceBuiltin(1, 3, lowList), lowExpected)
  }

  test("slice low populated list 2 with builtin") {
    assertEquals(sliceBuiltin(2, 3, lowList), List())
  }

  test("slice list with recursive") {
    assertEquals(sliceRecursive(3, 7, list), expected)
  }

  test("slice empty list with recursive") {
    assertEquals(sliceRecursive(3, 7, List()), List())
  }

  test("slice low populated list with recursive") {
    assertEquals(sliceRecursive(1, 3, lowList), lowExpected)
  }

  test("slice low populated list 2 with recursive") {
    assertEquals(sliceRecursive(2, 3, lowList), List())
  }

  test("slice list with tail recursive") {
    assertEquals(sliceTail(3, 7, list), expected)
  }

  test("slice empty list with tail recursive") {
    assertEquals(sliceTail(3, 7, List()), List())
  }

  test("slice low populated list with tail recursive") {
    assertEquals(sliceTail(1, 3, lowList), lowExpected)
  }

  test("slice low populated list 2 with tail recursive") {
    assertEquals(sliceTail(2, 3, lowList), List())
  }

  test("slice list with functional way") {
    assertEquals(slice(3, 7, list), expected)
  }

  test("slice empty list with functional way") {
    assertEquals(slice(3, 7, List()), List())
  }

  test("slice low populated list with functional way") {
    assertEquals(slice(1, 3, lowList), lowExpected)
  }

  test("slice low populated list 2 with functional way") {
    assertEquals(slice(2, 3, lowList), List())
  }

}

package in.yayd.era.s99

import P19._

class P19Test extends munit.FunSuite {
  private val list =
    List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k").map(Symbol(_))
  private val expected1 =
    List("d", "e", "f", "g", "h", "i", "j", "k", "a", "b", "c").map(Symbol(_))
  private val expected2 =
    List("j", "k", "a", "b", "c", "d", "e", "f", "g", "h", "i").map(Symbol(_))
  private val expected3 =
    List("b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "a").map(Symbol(_))
  private val expected4 =
    List("k", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j").map(Symbol(_))

  test("rotate list 3") {
    assertEquals(rotate(3, list), expected1)
  }

  test("rotate list -2") {
    assertEquals(rotate(-2, list), expected2)
  }

  test("rotate low populated list with 12") {
    assertEquals(rotate(12, list), expected3)
  }

  test("rotate low populated list with -12") {
    assertEquals(rotate(-12, list), expected4)
  }

}

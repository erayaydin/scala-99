package in.yayd.era.s99

import P07._

class P07Test extends munit.FunSuite {
  private val list = List(List(1, 1), 2, List(3, List(5, 8)))
  private val expected = List(1, 1, 2, 3, 5, 8)

  test("Flatten test with integer and list of integer, normal method") {
    assertEquals(flatten(list), expected)
  }

  test("Flatten test with integer and list of integer, tail recursive method") {
    assertEquals(flattenTail(list), expected)
  }
}

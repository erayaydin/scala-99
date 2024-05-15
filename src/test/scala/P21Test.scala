package in.yayd.era.s99

import P21.{insertAt, insertAtWithSplit}

class P21Test extends munit.FunSuite {
  private val list = List("a", "b", "c", "d").map(Symbol(_))
  private val expected = List("a", "new", "b", "c", "d").map(Symbol(_))

  test("insert at test") {
    assertEquals(insertAt(Symbol("new"), 1, list), expected)
  }

  test("insert at with split way") {
    assertEquals(insertAtWithSplit(Symbol("new"), 1, list), expected)
  }
}

package in.yayd.era.s99

import P23.randomSelect

class P23Test extends munit.FunSuite {
  private val list =
    List("a", "b", "c", "d", "e", "f", "g", "h").map(Symbol(_))
  private val expected =
    List("f", "e", "b").map(Symbol(_))
  private implicit val random: MockRandomInt = new MockRandomInt

  test("random select test") {
    random.setValues(5, 4, 1)

    assertEquals(randomSelect(3, list), expected)
  }
}

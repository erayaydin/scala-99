package in.yayd.era.s99

import P25._

class P25Test extends munit.FunSuite {
  private val list = List("a", "b", "c", "d", "e", "f").map(Symbol(_))
  private val expected = List("b", "a", "d", "c", "e", "f").map(Symbol(_))
  private implicit val random: MockRandomInt = new MockRandomInt
  random.setValues(1, 0, 1, 0, 0, 0)

  test("random permute simple") {
    assertEquals(randomPermute(list), expected)
  }

  test("random permute with Fisher-Yates way") {
    assertEquals(randomPermuteFisher(list), expected)
  }
}

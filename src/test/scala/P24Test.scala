package in.yayd.era.s99

import P24.lotto

class P24Test extends munit.FunSuite {
  private implicit val random: MockRandomInt = new MockRandomInt

  test("lotto test") {
    random.setValues(22, 0, 15, 29, 18, 31)

    assertEquals(lotto(6, 49), List(23, 1, 17, 33, 21, 37))
  }
}

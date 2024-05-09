package in.yayd.era.s99

import P03._

class P03Test extends munit.FunSuite {
  private val list = List(1, 1, 2, 3, 5, 8)

  test("Get third element with builtin method") {
    assertEquals(nthBuiltin(2, list), 2)
  }

  test(
    "Throw index out of bounds exception when index not in correct range, builtin method"
  ) {
    intercept[IndexOutOfBoundsException] {
      nthBuiltin(1, List())
    }
    intercept[IndexOutOfBoundsException] {
      nthBuiltin(-1, List())
    }
  }

  test("Get third element with manual method") {
    assertEquals(nth(2, list), 2)
  }

  test(
    "Throw index out of bounds exception when index not in correct range, manual method"
  ) {
    intercept[IndexOutOfBoundsException] {
      nth(1, List(1))
    }
    intercept[IndexOutOfBoundsException] {
      nth(-1, List(1, 2))
    }
  }
}

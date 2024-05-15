package in.yayd.era.s99

import P27._

class P27Test extends munit.FunSuite {
  private val list =
    List("Aldo", "Beat", "Carla", "David")
  private val expected = List(
    List(List("Aldo"), List("Beat", "Carla")),
    List(List("Aldo"), List("Beat", "David")),
    List(List("Aldo"), List("Carla", "David")),
    List(List("Beat"), List("Aldo", "Carla")),
    List(List("Beat"), List("Aldo", "David")),
    List(List("Beat"), List("Carla", "David")),
    List(List("Carla"), List("Aldo", "Beat")),
    List(List("Carla"), List("Aldo", "David")),
    List(List("Carla"), List("Beat", "David")),
    List(List("David"), List("Aldo", "Beat")),
    List(List("David"), List("Aldo", "Carla")),
    List(List("David"), List("Beat", "Carla"))
  )

  test("group test") {
    assertEquals(group(List(1, 2), list), expected)
  }
}

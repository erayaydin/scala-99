package in.yayd.era.s99

import scala.util.Random

class MockRandomInt extends Random {
  private var values: List[Int] = List.empty

  def setValues(newValues: Int*): Unit = {
    values = newValues.toList
  }

  override def nextInt(n: Int): Int = {
    values match {
      case Nil => super.nextInt(n)
      case head :: tail => {
        values = tail
        head
      }
    }
  }
}

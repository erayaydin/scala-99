package in.yayd.era.s99

object P15 {
  def duplicateN[A](n: Int, list: List[A]): List[A] =
    list.flatMap(List.fill(n)(_))

}

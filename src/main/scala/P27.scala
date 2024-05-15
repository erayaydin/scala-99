package in.yayd.era.s99

/** Group the elements of a set into disjoint subsets.
  *
  * {{{
  * scala> group3(List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
  * res0: List[List[List[String]]] = List(List(List(Aldo, Beat), List(Carla, David, Evi), List(Flip, Gary, Hugo, Ida)), ...
  * }}}
  *
  * {{{
  * scala> group(List(2, 2, 5), List("Aldo", "Beat", "Carla", "David", "Evi", "Flip", "Gary", "Hugo", "Ida"))
  * res0: List[List[List[String]]] = List(List(List(Aldo, Beat), List(Carla, David), List(Evi, Flip, Gary, Hugo, Ida)), ...
  * }}}
  */
object P27 {
  import P26.combinations

  def group3[A](list: List[A]): List[List[List[A]]] = group(List(2, 3, 4), list)

  def group[A](n: List[Int], list: List[A]): List[List[List[A]]] = n match {
    case Nil => List(Nil)
    case num :: tail =>
      combinations(num, list).flatMap { c =>
        group(tail, list diff c).map { c :: _ }
      }
  }
}

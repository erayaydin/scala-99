package in.yayd.era.s99

/** Generate the combinations of K distinct objects chosen from the N elements of a list.
  *
  * {{{
  * scala> combinations(3, List('a, 'b, 'c, 'd, 'e, 'f))
  * res0: List[List[Symbol]] = List(List('a, 'b, 'c), List('a, 'b, 'd), List('a, 'b, 'e), ...
  * }}}
  */
object P26 {
  def combinations[A](k: Int, list: List[A]): List[List[A]] =
    if (k == 0) List(Nil)
    else
      list match {
        case Nil => Nil
        case head :: tail =>
          combinations(k - 1, tail).map(head :: _) ::: combinations(k, tail)
      }
}

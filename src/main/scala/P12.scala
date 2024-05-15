package in.yayd.era.s99

/** Decode a run-length encoded list.
  *
  * {{{
  * scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
  * res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  * }}}
  */
object P12 {
  def decode[A](list: List[(Int, A)]): List[A] =
    list.flatMap { elem => List.fill(elem._1)(elem._2) }
}

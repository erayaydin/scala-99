package in.yayd.era.s99

/** Duplicate the elements of a list.
  *
  * {{{
  * scala> duplicate(List('a, 'b, 'c, 'c, 'd))
  * res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
  * }}}
  */
object P14 {
  def duplicate[A](list: List[A]): List[A] = {
    list.flatMap { elem => List.fill(2)(elem) }
  }
}

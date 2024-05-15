package in.yayd.era.s99

/** Run-length encoding of a list (direct solution).
  *
  * {{{
  * scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  * }}}
  */
object P13 {
  def encodeDirect[A](list: List[A]): List[(Int, A)] = {
    if (list.isEmpty) Nil
    else {
      val (packed, next) = list span { _ == list.head }
      (packed.length, packed.head) :: encodeDirect(next)
    }
  }
}

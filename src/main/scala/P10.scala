package in.yayd.era.s99

import P09.pack

/** Run-length encoding of a list.
  *
  * {{{
  * scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  * }}}
  */
object P10 {
  def encode[A](list: List[A]): List[(Int, A)] =
    pack(list).map { elem =>
      (elem.length, elem.head)
    }
}

package in.yayd.era.s99

import scala.annotation.tailrec

/** Flatten a nested list structure.
  *
  * {{{
  * scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
  * res0: List[Any] = List(1, 1, 2, 3, 5, 8)
  * }}}
  */
object P07 {
  def flattenTail[A](list: List[Any]): List[Any] = {
    @tailrec
    def _flattenTail(list: List[Any], flatten: List[Any]): List[Any] =
      list match {
        case Nil                    => flatten
        case (head: List[_]) :: Nil => _flattenTail(head, flatten)
        case (head: List[_]) :: tail =>
          _flattenTail(tail, flatten ::: flattenTail(head))
        case head :: tail => _flattenTail(tail, flatten ::: List(head))
      }
    _flattenTail(list, List())
  }

  def flatten[A](list: List[Any]): List[Any] = list flatMap {
    case list: List[_] => flatten(list)
    case element       => List(element)
  }
}

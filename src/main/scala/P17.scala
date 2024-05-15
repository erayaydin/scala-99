package in.yayd.era.s99

import scala.annotation.tailrec

/** Split a list into two parts.
  *
  * {{{
  * scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * }}}
  */
object P17 {
  def splitBuiltin[A](n: Int, list: List[A]): (List[A], List[A]) =
    list.splitAt(n)

  def splitRecursive[A](n: Int, list: List[A]): (List[A], List[A]) =
    (n, list) match {
      case (_, Nil)  => (Nil, Nil)
      case (0, list) => (Nil, list)
      case (n, h :: tail) => {
        val (pre, post) = splitRecursive(n - 1, tail)
        (h :: pre, post)
      }
    }

  def splitTail[A](n: Int, list: List[A]): (List[A], List[A]) = {
    @tailrec
    def splitTail(i: Int, list: List[A], pre: List[A]): (List[A], List[A]) =
      (i, list) match {
        case (_, Nil)       => (pre.reverse, Nil)
        case (0, list)      => (pre.reverse, list)
        case (n, h :: tail) => splitTail(n - 1, tail, h :: pre)
      }
    splitTail(n, list, Nil)
  }

  def split[A](n: Int, list: List[A]): (List[A], List[A]) =
    (list.take(n), list.drop(n))
}

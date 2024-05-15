package in.yayd.era.s99

import scala.annotation.tailrec

/** Create a list containing all integers within a given range.
  *
  * {{{
  * scala> range(4, 9)
  * res0: List[Int] = List(4, 5, 6, 7, 8, 9)
  * }}}
  */
object P22 {
  def rangeBuiltin(start: Int, end: Int): List[Int] = List.range(start, end + 1)

  def rangeRecursive(start: Int, end: Int): List[Int] =
    if (start > end) Nil
    else start :: rangeRecursive(start + 1, end)

  def rangeTail(start: Int, end: Int): List[Int] =
    @tailrec
    def rangeTail(end: Int, list: List[Int]): List[Int] = {
      if (start > end) list
      else rangeTail(end - 1, end :: list)
    }
    rangeTail(end, Nil)

  private def unfoldR[A, B](s: B)(f: B => Option[(A, B)]): List[A] =
    f(s).fold(List.empty[A]) {
      case (a, b) => a :: unfoldR(b)(f)
    }

  def range(start: Int, end: Int): List[Int] =
    unfoldR(start) { n =>
      if (n > end) None
      else Some((n, n+1))
    }
}

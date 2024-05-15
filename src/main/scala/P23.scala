package in.yayd.era.s99

import P20.removeAt

import scala.util.Random

/** Extract a given number of randomly selected elements from a list.
  *
  * {{{
  * scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
  * res0: List[Symbol] = List('e, 'd, 'a)
  * }}}
  */
object P23 {
  def randomSelect[A](c: Int, list: List[A])(implicit
      r: Random = new Random
  ): List[A] =
    if (c <= 0) Nil
    else {
      val (rest, e) = removeAt(r.nextInt(list.length), list)
      e :: randomSelect(c - 1, rest)
    }
}

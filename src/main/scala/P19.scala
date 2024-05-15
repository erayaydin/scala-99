package in.yayd.era.s99

import scala.annotation.tailrec

/** Rotate a list N places to the left.
  *
  * {{{
  * scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
  * }}}
  *
  * {{{
  * scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res0: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
  * }}}
  */
object P19 {
  @tailrec
  def rotate[A](n: Int, list: List[A]): List[A] = {
    val count = if (list.isEmpty) 0 else n % list.length
    if (count < 0) rotate(count + list.length, list)
    else list.drop(count) ::: list.take(count)
  }
}

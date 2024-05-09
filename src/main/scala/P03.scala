package in.yayd.era.s99

import scala.annotation.tailrec

/** Find the Kth element of a list.
  *
  * {{{
  * scala> nth(2, List(1, 1, 2, 3, 5, 8))
  * res0: Int = 2
  * }}}
  */
object P03 {
  def nthBuiltin[A](n: Int, list: List[A]): A = list(n)

  @tailrec
  def nth[A](n: Int, list: List[A]): A = (n, list) match {
    case (0, head :: _) => head
    case (n, Nil)       => throw IndexOutOfBoundsException()
    case (n, _ :: tail) => nth(n - 1, tail)
  }
}

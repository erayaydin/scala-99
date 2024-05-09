package in.yayd.era.s99

import scala.annotation.tailrec

/** Find the last but one element of a list.
  *
  * {{{
  * scala> penultimate(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 5
  * }}}
  */
object P02 {
  def penultimateBuiltin[A](list: List[A]): A =
    if (list.nonEmpty) list.init.last
    else throw new NoSuchElementException

  @tailrec
  def penultimate[A](list: List[A]): A = list match {
    case elem :: _ :: Nil => elem
    case _ :: tail        => penultimate(tail)
    case Nil              => throw new NoSuchElementException
  }
}

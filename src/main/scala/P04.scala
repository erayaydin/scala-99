package in.yayd.era.s99

import scala.annotation.tailrec

/** Find the number of elements of a list.
  *
  * {{{
  * scala> length(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 6
  * }}}
  */
object P04 {
  def lengthBuiltin[A](list: List[A]): Int = list.length

  def length[A](list: List[A]): Int = {
    @tailrec
    def length(list: List[A], acc: Int): Int = list match {
      case Nil          => acc
      case head :: tail => length(tail, acc + 1)
    }
    length(list, 0)
  }
}

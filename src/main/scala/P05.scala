package in.yayd.era.s99

import scala.annotation.tailrec

/** Reverse a list.
  *
  * {{{
  * scala> reverse(List(1, 1, 2, 3, 5, 8))
  * res0: List[Int] = List(8, 5, 3, 2, 1, 1)
  * }}}
  */
object P05 {
  def reverseBuiltin[A](list: List[A]): List[A] = list.reverse

  def reverseSimple[A](list: List[A]): List[A] = list match {
    case Nil          => Nil
    case head :: tail => reverseSimple(tail) ::: List(head)
  }

  def reverseTail[A](list: List[A]): List[A] = {
    @tailrec
    def reverseTail(list: List[A], reversed: List[A]): List[A] = list match {
      case Nil          => reversed
      case head :: tail => reverseTail(tail, head :: reversed)
    }
    reverseTail(list, Nil)
  }

  def reverse[A](list: List[A]): List[A] =
    list.foldLeft(List[A]()) { (reversed, head) =>
      head :: reversed
    }
}

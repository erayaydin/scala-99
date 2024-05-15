package in.yayd.era.s99

import scala.annotation.tailrec

/** Drop every Nth element from a list.
  *
  * {{{
  * scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
  * }}}
  */
object P16 {
  def dropRecursive[A](n: Int, list: List[A]): List[A] = {
    def dropRecursive(i: Int, list: List[A]): List[A] = (i, list) match {
      case (_, Nil)       => Nil
      case (1, _ :: tail) => dropRecursive(n, tail)
      case (_, h :: tail) => h :: dropRecursive(i - 1, tail)
    }
    dropRecursive(n, list)
  }

  def dropTail[A](n: Int, list: List[A]): List[A] = {
    @tailrec
    def dropTail(i: Int, list: List[A], acc: List[A]): List[A] =
      (i, list) match {
        case (_, Nil)       => acc.reverse
        case (1, _ :: tail) => dropTail(n, tail, acc)
        case (_, h :: tail) => dropTail(i - 1, tail, h :: acc)
      }

    dropTail(n, list, Nil)
  }

  def drop[A](n: Int, list: List[A]): List[A] =
    list.zipWithIndex.filter(x => (x._2 + 1) % n != 0).map(_._1)

  def dropGrouped[A](n: Int, list: List[A]): List[A] =
    list.grouped(n).flatMap(_.take(n - 1)).toList
}

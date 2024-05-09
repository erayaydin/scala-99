package in.yayd.era.s99

import scala.annotation.tailrec

/** Eliminate consecutive duplicates of list elements.
  *
  * {{{
  * scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
  * }}}
  */
object P08 {
  def compressRecursive[A](list: List[A]): List[A] = list match {
    case Nil          => Nil
    case head :: tail => head :: compressRecursive(tail.dropWhile(_ == head))
  }

  def compressTail[A](list: List[A]): List[A] = {
    @tailrec
    def compressTail(list: List[A], compressed: List[A]): List[A] = list match {
      case head :: tail =>
        compressTail(tail.dropWhile(_ == head), head :: compressed)
      case Nil => compressed.reverse
    }
    compressTail(list, Nil)
  }

  def compress[A](list: List[A]): List[A] = {
    list.foldRight(List[A]()) { (head, remaining) =>
      if (remaining.isEmpty || remaining.head != head) head :: remaining
      else remaining
    }
  }
}

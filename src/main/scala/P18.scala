package in.yayd.era.s99

import scala.annotation.tailrec

/** Extract a slice from a list.
  *
  * {{{
  * scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  * res0: List[Symbol] = List('d, 'e, 'f, 'g)
  * }}}
  */
object P18 {
  def sliceBuiltin[A](i: Int, k: Int, list: List[A]): List[A] =
    list.slice(i, k)

  def sliceRecursive[A](i: Int, k: Int, list: List[A]): List[A] =
    (i, k, list) match {
      case (_, _, Nil)                 => Nil
      case (_, k, _) if k <= 0         => Nil
      case (i, k, h :: tail) if i <= 0 => h :: sliceRecursive(0, k - 1, tail)
      case (i, k, h :: tail)           => sliceRecursive(i - 1, k - 1, tail)
    }

  def sliceTail[A](i: Int, k: Int, list: List[A]): List[A] =
    @tailrec
    def sliceTail(c: Int, list: List[A], acc: List[A]): List[A] =
      (c, list) match {
        case (_, Nil) => acc.reverse
        case (c, h :: _) if k <= c => acc.reverse
        case (c, h :: tail) if i <= c => sliceTail(c + 1, tail, h :: acc)
        case (c, _ :: tail) => sliceTail(c + 1, tail, acc)
      }
    sliceTail(0, list, Nil)

  //noinspection DropTakeToSlice
  def slice[A](i: Int, k: Int, list: List[A]): List[A] =
    list drop i take (k - (i max 0))
}

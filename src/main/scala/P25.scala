package in.yayd.era.s99

import P23.randomSelect
import P20.removeAt

import scala.annotation.tailrec
import scala.util.Random

/** Generate a random permutation of the elements of a list.
  *
  * {{{
  * scala> randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
  * res0: List[Symbol] = List('b, 'a, 'd, 'c, 'e, 'f)
  * }}}
  */
object P25 {
  def randomPermute[A](list: List[A])(implicit r: Random = new Random): List[A] = randomSelect(list.length, list)

  def randomPermuteFisher[A](list: List[A])(implicit r: Random = new Random): List[A] =
    @tailrec
    def randomPermuteFisher(list: List[A], acc: List[A])(implicit r: Random): List[A] = list match {
      case Nil => acc.reverse
      case _ =>
        val (rest, elem) = removeAt(r.nextInt(list.length), list)
        randomPermuteFisher(rest, elem :: acc)
    }
    randomPermuteFisher(list, Nil)
}

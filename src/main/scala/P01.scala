package in.yayd.era.s99

import scala.annotation.tailrec
import java.util.NoSuchElementException

/** Find the last element of a list.
  *
  * {{{
  * scala> last(List(1, 1, 2, 3, 5, 8))
  * res0: Int = 8
  * }}}
  */
object P01 {
  def lastBuiltin[A](list: List[A]): A = list.last

  @tailrec
  def last[A](list: List[A]): A = list match {
    case elem :: Nil => elem
    case _ :: tail   => last(tail)
    case Nil =>
      throw new NoSuchElementException("There is no element in the list")
  }
}

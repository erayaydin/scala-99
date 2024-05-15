package in.yayd.era.s99

import scala.util.Random

/** Lotto: Draw N different random numbers from the set 1..M.
  *
  * {{{
  * scala> lotto(6, 49)
  * res0: List[Int] = List(23, 1, 17, 33, 21, 37)
  * }}}
  */
object P24 {
  import P23.randomSelect
  import P22.range

  def lotto(count: Int, max: Int)(implicit r: Random = new Random): List[Int] =
    randomSelect(count, range(1, max + 1))
}

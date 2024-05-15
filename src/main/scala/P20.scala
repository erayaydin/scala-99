package in.yayd.era.s99

/** Remove the Kth element from a list.
  *
  * {{{
  * scala> removeAt(1, List('a, 'b, 'c, 'd))
  * res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)
  * }}}
  */
object P20 {
  def removeAtBuiltin[A](k: Int, list: List[A]): (List[A], A) =
    list.splitAt(k) match {
      case (Nil, _) if k < 0 => throw new NoSuchElementException
      case (pre, e :: post)  => (pre ::: post, e)
      case (pre, Nil)        => throw new NoSuchElementException
    }

  def removeAt[A](k: Int, list: List[A]): (List[A], A) =
    if (k < 0) throw new NoSuchElementException
    else
      (k, list) match {
        case (_, Nil)       => throw new NoSuchElementException
        case (0, h :: tail) => (tail, h)
        case (_, h :: tail) =>
          val (t, e) = removeAt(k - 1, list.tail)
          (list.head :: t, e)
      }
}

package in.yayd.era.s99

/** Insert an element at a given position into a list.
  *
  * {{{
  * scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
  * res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
  * }}}
  */
object P21 {
  def insertAt[A](e: A, i: Int, list: List[A]): List[A] =
    list.take(i) ::: e :: list.drop(i)

  def insertAtWithSplit[A](e: A, i: Int, list: List[A]): List[A] =
    list.splitAt(i) match {
      case (pre, post) => pre ::: e :: post
    }
}

package in.yayd.era.s99

import P10.encode

/** Modified run-length encoding.
  *
  * {{{
  * scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  * res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
  * }}}
  */
object P11 {
  def encodeModified[A](list: List[A]): List[Either[A, (Int, A)]] = {
    encode(list)
      .map {
        case (1, elem) => Left(elem)
        case tuple     => Right(tuple)
      }
  }
}

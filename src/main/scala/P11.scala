package in.yayd.era.s99

import P10.encode

object P11 {
  def encodeModified[A](list: List[A]): List[Either[A, (Int, A)]] = {
    encode(list)
      .map {
        case (1, elem) => Left(elem)
        case tuple     => Right(tuple)
      }
  }
}

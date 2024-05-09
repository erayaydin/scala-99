package in.yayd.era.s99

import scala.annotation.tailrec

/** Find out whether a list is a palindrome.
  *
  * {{{
  * scala> isPalindrome(List(1, 2, 3, 2, 1))
  * res0: Boolean = true
  * }}}
  */
object P06 {
  def isPalindromeNonEfficiency[A](list: List[A]): Boolean =
    list == list.reverse

  def isPalindrome[A](list: List[A]): Boolean = {
    @tailrec
    def isPalindrome(list: List[A], result: Boolean): Boolean = list match {
      case Nil         => result
      case head :: Nil => result
      case list =>
        isPalindrome(list.tail.init, result && list.head == list.last)
    }
    isPalindrome(list, true)
  }
}

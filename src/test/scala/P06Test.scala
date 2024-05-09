package in.yayd.era.s99

import P06._

class P06Test extends munit.FunSuite {
  private val palindromeList = List(1, 2, 3, 2, 1)
  private val nonPalindromeList = List(1, 2, 3, 2)
  private val singleList = List(1)

  test("Palindrome test with non-efficiency method") {
    assertEquals(isPalindromeNonEfficiency(palindromeList), true)
    assertEquals(isPalindromeNonEfficiency(singleList), true)
  }

  test("Non-palindrome test with non-efficiency method") {
    assertEquals(isPalindromeNonEfficiency(nonPalindromeList), false)
  }

  test("Palindrome test with tail recursive method") {
    assertEquals(isPalindrome(palindromeList), true)
    assertEquals(isPalindrome(singleList), true)
  }

  test("Non-palindrome test with tail recursive method") {
    assertEquals(isPalindrome(nonPalindromeList), false)
  }
}

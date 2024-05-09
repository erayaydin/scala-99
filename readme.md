# Scala-99 Problems

## P01: Find the last element of a list.

```scala_worksheet
scala> last(List(1, 1, 2, 3, 5, 8))
res0: Int = 8
```

## P02: Find the last but one element of a list.

```scala_worksheet
scala> penultimate(List(1, 1, 2, 3, 5, 8))
res0: Int = 5
```

## P03: Find the Kth element of a list.

```scala_worksheet
scala> nth(2, List(1, 1, 2, 3, 5, 8))
res0: Int = 2
```

## P04: Find the number of elements of a list.

```scala_worksheet
scala> length(List(1, 1, 2, 3, 5, 8))
res0: Int = 6
```

## P05: Reverse a list.

```scala_worksheet
scala> reverse(List(1, 1, 2, 3, 5, 8))
res0: List[Int] = List(8, 5, 3, 2, 1, 1)
```

## P06: Find out whether a list is a palindrome.

```scala_worksheet
scala> isPalindrome(List(1, 2, 3, 2, 1))
res0: Boolean = true
```

## P07: Flatten a nested list structure.

```scala_worksheet
scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
res0: List[Any] = List(1, 1, 2, 3, 5, 8)
```

## P08: Eliminate consecutive duplicates of list elements.

```scala_worksheet
scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
```

## P09: Pack consecutive duplicates of list elements into sub lists.

```scala_worksheet
scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
```

---

[Original List](https://aperiodic.net/pip/scala/s-99/)
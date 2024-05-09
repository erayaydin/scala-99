# Scala-99 Problems

## [P01: Find the last element of a list.](https://github.com/erayaydin/scala-99/blob/main/src/main/scala/P01.scala)

```scala_worksheet
scala> last(List(1, 1, 2, 3, 5, 8))
res0: Int = 8
```

## [P02: Find the last but one element of a list.](https://github.com/erayaydin/scala-99/blob/main/src/main/scala/P02.scala)

```scala_worksheet
scala> penultimate(List(1, 1, 2, 3, 5, 8))
res0: Int = 5
```

## [P03: Find the Kth element of a list.](https://github.com/erayaydin/scala-99/blob/main/src/main/scala/P03.scala)

```scala_worksheet
scala> nth(2, List(1, 1, 2, 3, 5, 8))
res0: Int = 2
```

## [P04: Find the number of elements of a list.](https://github.com/erayaydin/scala-99/blob/main/src/main/scala/P04.scala)

```scala_worksheet
scala> length(List(1, 1, 2, 3, 5, 8))
res0: Int = 6
```

## [P05: Reverse a list.](https://github.com/erayaydin/scala-99/blob/main/src/main/scala/P05.scala)

```scala_worksheet
scala> reverse(List(1, 1, 2, 3, 5, 8))
res0: List[Int] = List(8, 5, 3, 2, 1, 1)
```

## [P06: Find out whether a list is a palindrome.](https://github.com/erayaydin/scala-99/blob/main/src/main/scala/P06.scala)

```scala_worksheet
scala> isPalindrome(List(1, 2, 3, 2, 1))
res0: Boolean = true
```

## [P07: Flatten a nested list structure.](https://github.com/erayaydin/scala-99/blob/main/src/main/scala/P07.scala)

```scala_worksheet
scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
res0: List[Any] = List(1, 1, 2, 3, 5, 8)
```

## [P08: Eliminate consecutive duplicates of list elements.](https://github.com/erayaydin/scala-99/blob/main/src/main/scala/P08.scala)

```scala_worksheet
scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
```

## [P09: Pack consecutive duplicates of list elements into sub lists.](https://github.com/erayaydin/scala-99/blob/main/src/main/scala/P09.scala)

```scala_worksheet
scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
```

## [P10: Run-length encoding of a list.](https://github.com/erayaydin/scala-99/blob/main/src/main/scala/P10.scala)

```scala_worksheet
scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
```

---

[Original List](https://aperiodic.net/pip/scala/s-99/)
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

## [P11: Modified run-length encoding.](https://github.com/erayaydin/scala-99/blob/main/src/main/scala/P11.scala)

```scala_worksheet
scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
```

## [P12: Decode a run-length encoded list.](https://github.com/erayaydin/scala-99/blob/main/src/main/scala/P12.scala)

```scala_worksheet
scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
```

## [P13: Run-length encoding of a list (direct solution).](https://github.com/erayaydin/scala-99/blob/main/src/main/scala/P13.scala)

```scala_worksheet
scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
```

## [P14: Duplicate the elements of a list.](https://github.com/erayaydin/scala-99/blob/main/src/main/scala/P14.scala)

```scala_worksheet
scala> duplicate(List('a, 'b, 'c, 'c, 'd))
res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
```

## [P15: Duplicate the elements of a list a given number of times.](https://github.com/erayaydin/scala-99/blob/main/src/main/scala/P15.scala)

```scala_worksheet
scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
```

## [P16: Drop every Nth element from a list.](https://github.com/erayaydin/scala-99/blob/main/src/main/scala/P16.scala)

```scala_worksheet
scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
```

## [P17: Split a list into two parts.](https://github.com/erayaydin/scala-99/blob/main/src/main/scala/P17.scala)

```scala_worksheet
scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
```

## [P18: Extract a slice from a list.](https://github.com/erayaydin/scala-99/blob/main/src/main/scala/P18.scala)

```scala_worksheet
scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('d, 'e, 'f, 'g)
```

## [P19: Rotate a list N places to the left.](https://github.com/erayaydin/scala-99/blob/main/src/main/scala/P19.scala)

```scala_worksheet
scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
```

```scala_worksheet
scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
res0: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
```

## [P20: Remove the Kth element from a list.](https://github.com/erayaydin/scala-99/blob/main/src/main/scala/P20.scala)

```scala_worksheet
scala> removeAt(1, List('a, 'b, 'c, 'd))
res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)
```

## [P21: Insert an element at a given position into a list.](https://github.com/erayaydin/scala-99/blob/main/src/main/scala/P21.scala)

```scala_worksheet
scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
```

## [P22: Create a list containing all integers within a given range.](https://github.com/erayaydin/scala-99/blob/main/src/main/scala/P22.scala)

```scala_worksheet
scala> range(4, 9)
res0: List[Int] = List(4, 5, 6, 7, 8, 9)
```

---

[Original List](https://aperiodic.net/pip/scala/s-99/)
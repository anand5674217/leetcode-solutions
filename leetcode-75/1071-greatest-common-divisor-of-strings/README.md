# 1071. Greatest Common Divisor of Strings

## Problem
Given two strings `str1` and `str2`, return the largest string `x` such that `x` divides both strings.

String `x` divides string `s` if `s` can be built by concatenating `x` one or more times.

## Approach
If two strings have a common divisor string, then concatenating them in either order must produce the same result:

```text
str1 + str2 == str2 + str1
```

If this is not true, there is no valid answer.

If it is true, the largest divisor string length is the greatest common divisor of the two string lengths. Return the prefix of that length.

## Time Complexity
O(n + m)

## Space Complexity
O(n + m)


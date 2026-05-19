# 151. Reverse Words in a String

## Problem
Given a string `s`, reverse the order of the words.

The returned string must:
- contain words separated by a single space
- not contain leading or trailing spaces
- collapse multiple spaces between words

## Approach
Trim the input string, split it by one or more spaces, then append the words from right to left.

In Java, `split("\\s+")` handles multiple spaces between words.

## Time Complexity
O(n)

## Space Complexity
O(n)


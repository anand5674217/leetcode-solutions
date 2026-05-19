# 1768. Merge Strings Alternately

## Problem
Given two strings `word1` and `word2`, merge them by adding letters in alternating order, starting with `word1`.

If one string is longer, append the remaining characters to the end.

## Approach
Use two pointers, one for each string.

While either pointer still has characters left:
- append the next character from `word1` if available
- append the next character from `word2` if available

## Time Complexity
O(n + m)

## Space Complexity
O(n + m)


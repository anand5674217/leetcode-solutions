# 345. Reverse Vowels of a String

## Problem
Given a string `s`, reverse only the vowels in the string and return the result.

Vowels are `a`, `e`, `i`, `o`, `u`, and they can appear in lowercase or uppercase.

## Approach
Use two pointers:

- `left` starts at the beginning of the string
- `right` starts at the end of the string

Move each pointer until it points to a vowel. When both pointers are at vowels, swap them and continue.

## Time Complexity
O(n)

## Space Complexity
O(n)


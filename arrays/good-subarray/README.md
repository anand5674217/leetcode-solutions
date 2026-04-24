# Good Subarray

## Problem
Given an integer array `arr` and an integer `k`, return the length of the shortest subarray containing at least `k` distinct values.

If no such subarray exists, return `-1`.

## Approach
Use a sliding window with a frequency map.

- Expand the right pointer and count each value.
- Once the window has at least `k` distinct values, shrink from the left.
- Record the minimum valid window length while shrinking.

This works because every element enters and leaves the window at most once.

## Time Complexity
`O(n)`

## Space Complexity
`O(k)` to `O(n)` depending on how many distinct values appear.

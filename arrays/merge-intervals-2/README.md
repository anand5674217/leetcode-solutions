# Merge Intervals - 2

## Problem
Given a sorted list of non-overlapping intervals and one new interval, insert the new interval into the list and merge overlaps if needed.

## Approach
Process the intervals in three parts:

- Add all intervals that end before the new interval starts.
- Merge every interval that overlaps with the new interval.
- Add the remaining intervals unchanged.

Because the input intervals are already sorted and non-overlapping, a single left-to-right pass is enough.

## Time Complexity
`O(n)`

## Space Complexity
`O(n)` for the output list.

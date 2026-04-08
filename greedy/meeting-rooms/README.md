# Meeting Rooms

## Problem
Given meeting intervals, return the minimum number of conference rooms required.

## Approach
Split all start times and end times into separate arrays and sort both.

Use two pointers:
- If the next meeting starts before the earliest current meeting ends, a new room is needed.
- Otherwise, one room gets freed first and can be reused.

## Time Complexity
O(n log n)

## Space Complexity
O(n)

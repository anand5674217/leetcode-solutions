# 907. Sum of Subarray Minimums

## Approach
For each index, count how many subarrays use `arr[i]` as their minimum.

Use monotonic stacks to find:
- the previous smaller-or-equal element on the left
- the next strictly smaller element on the right

This tie-breaking handles duplicate values once. The contribution of `arr[i]` is:

`arr[i] * (i - left[i]) * (right[i] - i)`

Add every contribution modulo `1_000_000_007`.

## Time Complexity
O(n)

## Space Complexity
O(n)

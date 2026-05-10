# 3925. Concatenate Array With Reverse

## Approach
Create an answer array of length `2 * n`.

For every index `i`:
- copy `nums[i]` into the first half
- copy `nums[n - i - 1]` into the second half

This builds the original array followed by its reverse in one pass.

## Time Complexity
O(n)

## Space Complexity
O(n)

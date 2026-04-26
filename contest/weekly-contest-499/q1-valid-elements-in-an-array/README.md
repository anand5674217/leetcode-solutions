# Q1. Valid Elements in an Array

## Idea
The first and last elements are always valid.

For every other index:
- it is valid if it is strictly greater than the maximum element on its left
- or strictly greater than the maximum element on its right side

Precompute:
- `maxFromLeft[i]` = maximum value from `0` to `i`
- `maxFromRight[i]` = maximum value from `i` to `n - 1`

Then scan the middle elements and keep the ones that satisfy either condition.

## Complexity
- Time: `O(n)`
- Space: `O(n)`

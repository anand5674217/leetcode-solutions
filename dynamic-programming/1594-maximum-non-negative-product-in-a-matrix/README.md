# 1594. Maximum Non Negative Product in a Matrix

## Problem
Given a grid, move only right or down from top-left to bottom-right.
Return the maximum non-negative product modulo 1e9+7.
If the maximum product is negative, return -1.

## Approach
We track:
- `maxDp[i][j]` = maximum product reaching cell `(i, j)`
- `minDp[i][j]` = minimum product reaching cell `(i, j)`

Why both?
Because multiplying by a negative number can turn the minimum into maximum.

## Time Complexity
O(m * n)

## Space Complexity
O(m * n)

# 238. Product of Array Except Self

## Problem
Given an integer array `nums`, return an array `answer` where `answer[i]` is the product of every element except `nums[i]`.

The algorithm must run in `O(n)` time and cannot use division.

## Approach
Build two product arrays:

- `leftProduct[i]` stores the product from index `0` to `i`
- `rightProduct[i]` stores the product from index `i` to the end

For each index:

- if it is the first index, use the product on the right
- if it is the last index, use the product on the left
- otherwise, multiply the product before it by the product after it

## Time Complexity
O(n)

## Space Complexity
O(n)

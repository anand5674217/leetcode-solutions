# 724. Find Pivot Index

## Problem
Given an integer array `nums`, return the leftmost pivot index.

The pivot index is where the sum of all numbers strictly to the left equals the sum of all numbers strictly to the right.

Return `-1` if no pivot index exists.

## Approach
First calculate the total sum of the array.

Then scan from left to right while tracking `leftSum`. For each index:

```text
rightSum = totalSum - leftSum - nums[i]
```

If `leftSum == rightSum`, return the current index. Otherwise, add `nums[i]` to `leftSum` and continue.

## Time Complexity
O(n)

## Space Complexity
O(1)


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

## Optimization 1
[Optimization1.java](Optimization1.java) uses a prefix sum array.

First build `leftPrefix`, where `leftPrefix[i]` stores the sum from index `0` to `i`.

Then check each index:
- for index `0`, the right sum must be `0`
- for the last index, the left sum must be `0`
- for middle indexes, compare `leftPrefix[i - 1]` with `leftPrefix[n - 1] - leftPrefix[i]`

## Optimization 1 Time Complexity
O(n)

## Optimization 1 Space Complexity
O(n)

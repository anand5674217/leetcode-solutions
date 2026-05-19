# 2540. Minimum Common Value

## Problem
Given two integer arrays `nums1` and `nums2`, sorted in non-decreasing order, return the minimum integer common to both arrays.

Return `-1` if there is no common integer.

## Approach
Use two pointers because both arrays are already sorted.

- If `nums1[i] == nums2[j]`, return that value.
- If `nums1[i] < nums2[j]`, move `i`.
- Otherwise, move `j`.

The first match found is the minimum common value.

## Time Complexity
O(n + m)

## Space Complexity
O(1)


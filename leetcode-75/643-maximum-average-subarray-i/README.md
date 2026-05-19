# 643. Maximum Average Subarray I

## Problem
Given an integer array `nums` and an integer `k`, find the contiguous subarray of length `k` with the maximum average value.

## Approach
Use a sliding window of size `k`.

First calculate the sum of the first `k` elements. Then slide the window one position at a time by removing the element leaving the window and adding the new element entering the window.

Track the maximum window sum and return `maxSum / k`.

## Time Complexity
O(n)

## Space Complexity
O(1)


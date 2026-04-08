# 55. Jump Game

## Problem
You are given an integer array `nums`, where each element represents the maximum jump length from that position.

Return `true` if you can reach the last index starting from index `0`, otherwise return `false`.

## Approach
Use a greedy scan and keep track of the farthest index reachable so far.

If the current index is ever beyond that reachable boundary, the last index cannot be reached.
Otherwise, keep extending the boundary with `max(farthestReach, index + nums[index])`.

## Time Complexity
O(n)

## Space Complexity
O(1)

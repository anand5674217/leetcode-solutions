# 1431. Kids With the Greatest Number of Candies

## Problem
Given an array `candies` and an integer `extraCandies`, return a boolean list where each value tells whether that kid can have the greatest number of candies after receiving all extra candies.

Multiple kids can have the greatest number of candies.

## Approach
First find the current maximum candy count.

Then for each kid, check whether:

```text
candies[i] + extraCandies >= maxCandies
```

If true, that kid can have the greatest number of candies.

## Time Complexity
O(n)

## Space Complexity
O(n)


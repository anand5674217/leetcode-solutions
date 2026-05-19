# 283. Move Zeroes

## Problem
Given an integer array `nums`, move all `0`s to the end while maintaining the relative order of the non-zero elements.

The operation must be done in-place.

## Approach
Use a write pointer to track where the next non-zero value should go.

First, move every non-zero number to the front. Then fill the remaining positions with zeroes.

## Time Complexity
O(n)

## Space Complexity
O(1)


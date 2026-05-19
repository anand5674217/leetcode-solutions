# 605. Can Place Flowers

## Problem
Given a flowerbed array containing `0`s and `1`s, determine whether `n` new flowers can be planted without placing flowers in adjacent plots.

## Approach
Scan the flowerbed from left to right.

For each empty plot, check whether the left and right neighbors are also empty or outside the array. If both sides are valid, plant a flower there and increase the count.

Return `true` as soon as at least `n` flowers can be planted.

## Time Complexity
O(m)

## Space Complexity
O(1)


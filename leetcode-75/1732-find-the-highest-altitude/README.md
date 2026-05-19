# 1732. Find the Highest Altitude

## Problem
Given an array `gain`, where each value is the net altitude gain between two points, return the highest altitude reached.

The starting altitude is `0`.

## Approach
Track the current altitude while scanning `gain`.

After each gain, update the current altitude and keep the maximum altitude seen so far.

## Time Complexity
O(n)

## Space Complexity
O(1)


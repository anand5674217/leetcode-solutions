# 1886. Determine Whether Matrix Can Be Obtained By Rotation

## Approach
Check all 4 possible rotations:
- 0 degree
- 90 degree
- 180 degree
- 270 degree

For each rotation:
1. Compare matrix with target
2. If same, return true
3. Otherwise rotate and continue

## Time Complexity
O(4 * n^2) = O(n^2)

## Space Complexity
O(n^2)
# 503. Next Greater Element II

## Approach
Use a monotonic decreasing stack while scanning the array twice from right to left.

The doubled scan simulates the circular array. For each index, pop values that are less than or equal to the current value. The remaining stack top is the next greater value, or `-1` if none exists.

## Time Complexity
O(n)

## Space Complexity
O(n)

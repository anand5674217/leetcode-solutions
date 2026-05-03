# 496. Next Greater Element I

## Approach
Build the next-greater value for every number in `nums2` using a monotonic decreasing stack.

Scan `nums2` from right to left. Pop smaller values because they cannot be the next greater element for the current number. The remaining stack top is the answer, or `-1` when the stack is empty.

Use a hash map to answer each `nums1` query in O(1).

## Time Complexity
O(n + m)

## Space Complexity
O(m)

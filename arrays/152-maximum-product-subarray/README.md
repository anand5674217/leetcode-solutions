# 152. Maximum Product Subarray

## Approach
Keep track of both the maximum and minimum product ending at the current index.

This is necessary because a negative number can turn the current minimum product
into the next maximum product.

For each element:
- swap current max and min when the value is negative
- update the new max product ending here
- update the new min product ending here
- keep the global maximum answer

## Time Complexity
O(n)

## Space Complexity
O(1)

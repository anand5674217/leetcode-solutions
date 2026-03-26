# 121. Best Time to Buy and Sell Stock

## Approach
Track the minimum price seen so far while scanning the array once.

For each day:
- update the minimum buying price
- compute the profit if sold today
- keep the best profit seen so far

## Time Complexity
O(n)

## Space Complexity
O(1)

# 347. Top K Frequent Elements

## Approach
Count the frequency of each number with a hash map.

Push each `(value, frequency)` pair into a max heap and remove the top `k` elements.

## Time Complexity
O(n log n)

## Space Complexity
O(n)

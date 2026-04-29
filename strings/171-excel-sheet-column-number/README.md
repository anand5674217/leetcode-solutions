# 171. Excel Sheet Column Number

## Approach
Treat the column title like a base-26 number where:
- `A = 1`
- `B = 2`
- ...
- `Z = 26`

Scan from left to right. For each character, multiply the current answer by `26` and add the character value.

## Time Complexity
O(n)

## Space Complexity
O(1)

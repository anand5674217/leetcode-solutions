# 1207. Unique Number of Occurrences

## Problem
Given an array of integers `arr`, return `true` if the number of occurrences of each value in the array is unique or `false` otherwise.

### Example 1:
- **Input**: `arr = [1,2,2,1,1,3]`
- **Output**: `true`
- **Explanation**: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.

### Example 2:
- **Input**: `arr = [1,2]`
- **Output**: `false`

### Example 3:
- **Input**: `arr = [-3,0,1,-3,1,1,1,-3,10,0]`
- **Output**: `true`

## Constraints:
- `1 <= arr.length <= 1000`
- `-1000 <= arr[i] <= 1000`

## Approach
1. Use a `HashMap<Integer, Integer>` to store the frequency of each number in the input array.
2. Iterate through the frequencies (values) of the map.
3. Use a `List<Integer>` (or a `HashSet`) to keep track of seen frequencies.
4. If a frequency is already in the list, return `false`.
5. If we finish iterating without finding any duplicate frequencies, return `true`.

## Complexity
- **Time Complexity**: `O(n)`, where `n` is the length of the array. We iterate through the array once and then through the map values (at most `n` entries).
- **Space Complexity**: `O(n)` to store frequencies in the `HashMap` and unique frequencies in the list/set.

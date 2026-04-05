# Q1. Mirror Frequency Distance

## Idea
Count frequencies separately for:
- lowercase letters `a` to `z`
- digits `0` to `9`

For a character and its mirror:
- letter mirror: `i <-> 25 - i`
- digit mirror: `i <-> 9 - i`

Each mirror pair should be counted once, so iterate only through half of each range and add:
- `abs(letterFreq[i] - letterFreq[25 - i])`
- `abs(digitFreq[i] - digitFreq[9 - i])`

This runs in `O(n)` time with `O(1)` extra space.

## Code
See `Solution.java`

# Q1. Construct Uniform Parity Array I

## Idea
If all numbers already have same parity, answer is true.

If both odd and even exist, we can make all numbers odd:
- keep odd numbers unchanged
- for any even number x, choose an odd number y
- then x - y is odd

So the answer is always true.

## Code
See `Solution.java`
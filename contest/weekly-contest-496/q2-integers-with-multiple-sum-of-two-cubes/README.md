# Q2. Integers With Multiple Sum of Two Cubes

## Idea
Any valid pair satisfies:
- `x = a^3 + b^3`
- `1 <= a <= b`
- `x <= n`

So we only need to try cube values up to `cbrt(n)`.

For every pair `(a, b)`:
- compute `a^3 + b^3`
- count how many distinct pairs produce that sum

Any sum seen at least twice is a good integer.

The variable `lorqavined` is created midway in the function to store the input as required.

## Code
See `Solution.java`

# 876. Middle of the Linked List

## Approach
Use two pointers:
- `slow` moves one node at a time
- `fast` moves two nodes at a time

When `fast` reaches the end, `slow` is at the middle node.
For an even-length list, this naturally returns the second middle node.

## Time Complexity
O(n)

## Space Complexity
O(1)

## Run Locally
```bash
javac -d /tmp/leetcode-876 linked-list/876-middle-of-the-linked-list/Main.java linked-list/876-middle-of-the-linked-list/Solution.java
java -cp /tmp/leetcode-876 Main
```

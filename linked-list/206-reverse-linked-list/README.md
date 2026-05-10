# 206. Reverse Linked List

## Approach
Reverse the list iteratively by tracking three pointers:
- `previous` points to the reversed part of the list
- `current` points to the node being processed
- `nextNode` stores the next node before changing `current->next`

For each node, point it back to `previous`, then move both pointers forward.
When the loop ends, `previous` is the new head.

## Time Complexity
O(n)

## Space Complexity
O(1)

## Run Locally
```bash
javac linked-list/206-reverse-linked-list/Main.java linked-list/206-reverse-linked-list/Solution.java
java -cp linked-list/206-reverse-linked-list Main
```

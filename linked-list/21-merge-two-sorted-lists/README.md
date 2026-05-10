# 21. Merge Two Sorted Lists

## Approach
Use a dummy head and a `tail` pointer to build the merged list.

Compare the current nodes from both lists:
- attach the smaller node to `tail`
- move that list forward
- move `tail` forward

When one list ends, attach the remaining nodes from the other list.

## Time Complexity
O(n + m)

## Space Complexity
O(1)

## Run Locally
```bash
javac -d /tmp/leetcode-21 linked-list/21-merge-two-sorted-lists/Main.java linked-list/21-merge-two-sorted-lists/Solution.java
java -cp /tmp/leetcode-21 Main
```

import java.util.*;
//push

class LRUCacheFinal {

    int capacity;
    HashMap<Integer, Node> map;
    Node head, tail;

    public LRUCacheFinal(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();

        head = new Node(-1, -1);
        tail = new Node(-1, -1);

        head.right = tail;
        tail.left = head;
    }

    public int get(int key) {
        if (!map.containsKey(key)) return -1;

        Node node = map.get(key);
        delete(node);
        insert(node);

        return node.value;
    }

    public void put(int key, int value) {

        if (capacity == 0) return;

        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;

            delete(node);
            insert(node);
        } else {

            if (map.size() == capacity) {
                Node lru = tail.left;
                delete(lru);
                map.remove(lru.key);
            }

            Node newNode = new Node(key, value);
            insert(newNode);
            map.put(key, newNode);
        }
    }

    private void insert(Node node) {
        Node next = head.right;

        head.right = node;
        node.left = head;

        node.right = next;
        next.left = node;
    }

    private void delete(Node node) {
        Node prev = node.left;
        Node next = node.right;

        prev.right = next;
        next.left = prev;
    }

    class Node {
        int key, value;
        Node left, right;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
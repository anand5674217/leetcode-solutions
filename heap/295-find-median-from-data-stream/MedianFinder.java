import java.util.PriorityQueue;

public class MedianFinder {
    private PriorityQueue<Integer> leftMaxHeap; // max heap for the left half
    private PriorityQueue<Integer> rightMinHeap; // min heap for the right half

    public MedianFinder() {
        leftMaxHeap = new PriorityQueue<>((a, b) -> b - a);
        rightMinHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if (leftMaxHeap.isEmpty() || num <= leftMaxHeap.peek()) {
            leftMaxHeap.add(num);
        } else {
            rightMinHeap.add(num);
        }

        // Rebalance heaps
        if (leftMaxHeap.size() > rightMinHeap.size() + 1) {
            rightMinHeap.add(leftMaxHeap.poll());
        } else if (rightMinHeap.size() > leftMaxHeap.size()) {
            leftMaxHeap.add(rightMinHeap.poll());
        }
    }

    public double findMedian() {
        if (leftMaxHeap.size() == rightMinHeap.size()) {
            return (leftMaxHeap.peek() + rightMinHeap.peek()) / 2.0;
        } else {
            return leftMaxHeap.peek();
        }
    }

    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);    // arr = [1]
        medianFinder.addNum(2);    // arr = [1, 2]
        System.out.println(medianFinder.findMedian()); // return 1.5
        medianFinder.addNum(3);    // arr = [1, 2, 3]
        System.out.println(medianFinder.findMedian()); // return 2.0
    }
}

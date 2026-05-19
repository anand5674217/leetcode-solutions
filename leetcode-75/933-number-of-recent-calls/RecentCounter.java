class RecentCounter {

    // public Deque<Integer> aq = new ArrayDeque<>();
    public int[] aq = new int[10000];
    public int start = 0;
    public int end = 0;

    public RecentCounter() {
    }

    public int ping(int t) {
        aq[end++] = t;    
        while (aq[start] < t - 3000) {
            start++;
        }
        return end - start;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */

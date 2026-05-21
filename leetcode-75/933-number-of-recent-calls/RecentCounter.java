import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {

    Queue<Integer> q;

    public RecentCounter() {
        q= new LinkedList<Integer>();
    }

    public int ping(int t) {


        while(!q.isEmpty() && Math.abs((int)q.peek()-t)>3000){
            q.poll();
        }
        q.add(t);
        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */
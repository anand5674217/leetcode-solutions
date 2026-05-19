import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();
        
        System.out.println("ping(1): " + recentCounter.ping(1) + " (Expected: 1)");
        System.out.println("ping(100): " + recentCounter.ping(100) + " (Expected: 2)");
        System.out.println("ping(3001): " + recentCounter.ping(3001) + " (Expected: 3)");
        System.out.println("ping(3002): " + recentCounter.ping(3002) + " (Expected: 3)");
    }
}

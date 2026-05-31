public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canEatAll(piles, h, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean canEatAll(int[] piles, int h, int k) {
        long hoursNeeded = 0;
        for (int pile : piles) {
            hoursNeeded += (pile + k - 1) / k;
        }
        return hoursNeeded <= h;
    }

    public static void main(String[] args) {
        KokoEatingBananas solution = new KokoEatingBananas();

        // Example 1
        int[] piles1 = {3, 6, 7, 11};
        int h1 = 8;
        System.out.println("Example 1: " + solution.minEatingSpeed(piles1, h1)); // Expected: 4

        // Example 2
        int[] piles2 = {30, 11, 23, 4, 20};
        int h2 = 5;
        System.out.println("Example 2: " + solution.minEatingSpeed(piles2, h2)); // Expected: 30

        // Example 3
        int[] piles3 = {30, 11, 23, 4, 20};
        int h3 = 6;
        System.out.println("Example 3: " + solution.minEatingSpeed(piles3, h3)); // Expected: 23
    }
}

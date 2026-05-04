class Solution {
    public int sumOfPrimesInRange(int n) {
        int rev = reverseN(n);
        int min = Math.min(n, rev);
        int max = Math.max(n, rev);

        return getPrimeNoBetween(min, max);
    }

    public static int getPrimeNoBetween(int min, int max) {
        int total = max + 1;
        int[] arr = new int[total + 1];

        for (int i = 1; i <= total; i++) {
            arr[i] = i;
        }

        for (int i = 2; i * i <= max; i++) {
            for (int j = i * i; j <= max; j += i) {
                if (arr[j] % i == 0) {
                    arr[j] = -1;
                }
            }
        }

        int sum = 0;
        for (int i = min; i <= max; i++) {
            if (i < 2) {
                continue;
            }
            if (arr[i] != -1) {
                sum += arr[i];
            }
        }

        return sum;
    }

    public static int reverseN(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int val = n % 10;
            sb.append(val);
            n = n / 10;
        }
        return Integer.parseInt(sb.toString());
    }
}

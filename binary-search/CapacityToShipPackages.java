public class CapacityToShipPackages {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int max=0;
        long sum=0;
        for(int i=0;i<n;i++){
            max=Math.max(weights[i],max);
            sum+=weights[i];
        }

        for(int i=max;i<=sum;i++){
            int value=calculateDays(weights,i);
            if(value<=days){
                return value;
            }

        }
        return 0;
    }

    public int calculateDays(int[] weights, int max){
        int days=1,load=0;
        for(int i=0;i<weights.length;i++){

            if(load+weights[i]<=max){
                load=load+weights[i];
            }else{
                load=weights[i];
                days++;
            }

        }
        return days;
    }

    public static void main(String[] args) {
        CapacityToShipPackages solution = new CapacityToShipPackages();

        // Example 1
        int[] weights1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int days1 = 5;
        System.out.println("Example 1: " + solution.shipWithinDays(weights1, days1)); // Expected: 15

        // Example 2
        int[] weights2 = {3, 2, 2, 4, 1, 4};
        int days2 = 3;
        System.out.println("Example 2: " + solution.shipWithinDays(weights2, days2)); // Expected: 6

        // Example 3
        int[] weights3 = {1, 2, 3, 1, 1};
        int days3 = 4;
        System.out.println("Example 3: " + solution.shipWithinDays(weights3, days3)); // Expected: 3
    }
}
public class BestTimeToBuyAndSellStockSolution {

    public int maxProfit(int[] nums) {
        int n=nums.length;

        int min[]= new int[n];
        min[0]=nums[0];
        int max[]= new int[n];
        max[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            min[i]=min[i-1]>nums[i]?nums[i]:min[i-1];
        }

        for(int i=n-2;i>=0;i--){
            max[i]=max[i+1]>nums[i]?max[i+1]:nums[i];
        }
        int maxm=-1;
        for(int i=0;i<n;i++){
            if((max[i]-min[i])>maxm){
                maxm=max[i]-min[i];
            }
        }
        return maxm;
    }
}

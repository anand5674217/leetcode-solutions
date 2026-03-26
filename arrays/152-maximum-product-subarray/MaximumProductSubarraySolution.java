public class MaximumProductSubarraySolution {

    public int maxProduct(int[] nums) {

        int n=nums.length;
        long pref[]= new long[n];

        pref[0]=nums[0];

        for(int i=1;i<n;i++){

            pref[i]=pref[i-1]*nums[i];

        }

        int max=-1;
        for( int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int val=1;
                if(i==0){
                    val=(int)pref[j];
                } else if(pref[i]==0){
                    val=0;
                }else{
                    val=(int)(pref[j]/pref[i]);

                }
                if(val>max){
                    max=val;
                }
            }

        }
        return max;

    }
}

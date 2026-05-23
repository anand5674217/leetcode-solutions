class Solution {
    public int minimumSwaps(int[] nums) {
        int n=nums.length;
        int cnt=0,cnt0=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                cnt0++;
            }
        }
        for(int j=n-1;j>=0;j--){
            if(nums[j]!=0){
                for(int i=j-1;i>=0;i--){
                    if(nums[i]==0 && (i<n-cnt0)){
                        int temp=nums[j];
                        nums[i]=temp;
                        nums[j]=0;
                        cnt++;
                        break;
                    }
                }
            }
        }




        //  for(int i=0;i<n;i++){
        //      if(nums[i]==0){
        //          cnt++;
        //      }
        //  }
        // if(cnt==n){
        //    return 0;
        //  }

        //  for(int i=n-1;i>n/2;i--){
        //      if(nums[i]==0){
        //          cnt--;
        //      }
        //  }
        return cnt;
    }
}
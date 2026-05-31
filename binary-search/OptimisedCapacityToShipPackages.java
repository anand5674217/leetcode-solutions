class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int max=0;
        long sum=0;
        for(int i=0;i<n;i++){
            max=Math.max(weights[i],max);
            sum+=weights[i];
        }


        long low=max, high=sum;
        while(low<=high){
            long mid=(high+low)/2;
            int value=calculateDays(weights,(int)mid);
            if(value<=days){
                high=mid-1;
            }else{
                low=mid+1;
            }

        }

        // for(int i=max;i<=sum;i++){
        //     int value=calculateDays(weights,i);
        //     if(value<=days){
        //         return i;
        //     }

        // }
        // return 0;
        return (int)high+1;
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
}

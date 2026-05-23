class Solution {
    public int minOperations(int[] nums, int k) {
        int n=nums.length;
        int maxo=-1,maxe=-1;
        int o[]=new int[k];
        int e[]= new int[k];


        for(int i=0;i<n;i++){
            nums[i]=nums[i]%k;

            if(i%2==0){
                e[nums[i]]++;
                // maxe=Math.max(maxe,nums[i]);
            }else{
                o[nums[i]]++;
                //  maxo=Math.max(maxo,nums[i]);
            }
        }
        int no=-1,ne=-1;
        for(int i=0;i<k;i++){
            if(maxe<e[i]){
                maxe=e[i];
                ne=i;
            }
            //  maxe=Math.max(maxe,e[i]);
        }
        for(int i=0;i<k;i++){
            if(maxo<o[i] && i!=ne){
                maxo=o[i];
                no=i;
            }
            // maxo=Math.max(maxo,o[i]);
        }
        int mcnt=Integer.MAX_VALUE;
        for(int i=0;i<k;i++) {
            ne =i;
            for (int j = 0; j < k; j++) {
                no=j;
                if(ne==no) continue;



                int cnt = 0;
                for (int i1 = 0; i1 < n; i1++) {

                    if (i1 % 2 == 0) {
                        if (nums[i1] != ne) {
                            cnt += Math.min(
                                    Math.abs(nums[i1] - ne)%k,
                                    Math.abs(k - nums[i1] + ne)%k
                            );
                        }
                    } else {
                        if (nums[i1] != no) {
                            cnt += Math.min(
                                    Math.abs(nums[i1] - no),
                                    Math.abs(k - nums[i1] + no)
                            );
                        }

                    }
                }
                mcnt = Math.min(mcnt, cnt);
            }
        }

        return mcnt;

    }
}
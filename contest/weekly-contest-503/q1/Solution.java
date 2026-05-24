class Solution {
    public int[] limitOccurrences(int[] nums, int k) {

        int n=nums.length;
        LinkedHashMap<Integer,Integer> hm=new LinkedHashMap<>();
        for(int i=0;i<n;i++) {
            hs.put(nums[i],hs.getOrDefault(nums[i],0)+1);

        }
        List<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> map: hs.entrySet()) {


            int key = map.getKey();
            int val=map.getValue();
            val=val>k?k:val;
            while(val-->0) {
                list.add(key);

            }

        }

        int ans[]=new int[list.size()];
        for(int i=0;i<list.size();i++) {
            ans[i]=list.get(i);
        }
        return ans;

}
}

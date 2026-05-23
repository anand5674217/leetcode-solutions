import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int maxlen=0;
        int left=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(hm.containsKey(c) && hm.get(c)>=left){
                left=hm.get(c)+1;
            }
            hm.put(c,i);
            maxlen=Math.max(maxlen,i-left+1);
        }
        return maxlen;
        
    }
}
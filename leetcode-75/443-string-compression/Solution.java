import java.util.HashMap;

class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        char[] chars1= new char[n];
        int i=0,j=0,count=0,k=0;
        while(i<n && j<n){
            if(chars[i]==chars[j]){
                count++;
                j++;
            }else{
                chars1[k++]=chars[i];
                if(count>1){
                    String str=String.valueOf(count);
                    for(int x=0;x<str.length();x++){
                        chars1[k++]=str.charAt(x);
                    }
                }
                count=0;
                i=j;
            }
        }
        if(j==n && count>0){
            chars1[k++]=chars[i];
            String str=String.valueOf(count);
            if(count>1) {
                for (int x = 0; x < str.length(); x++) {
                    chars1[k++] = str.charAt(x);
                }
            }
        }
        for (int l = 0; l < chars1.length; l++) {
            chars[l]=chars1[l];
        }
       // chars=chars1;
        return k;





//        HashMap<Character,Integer> hs= new HashMap();
//
//
//
//
//
//        for(int i=0;i<n;i++){
//            hs.put(chars[i],hs.getOrDefault(chars[i],0)+1);
//        }
//
//        StringBuilder sb= new StringBuilder();
//        int k=0;
//        for(int i=0;i<n;i++){
//            if(hs.containsKey(chars[i])) {
//                int val = (int) hs.get(chars[i]);
//
//                if (val > 0) {
//                    sb.append(chars[i]);
//                    chars[k++] = chars[i];
//                    if (val > 1) {
//                        sb.append(val);
//                        if (val < 10)
//                            chars[k++] = (char) ('0' + val);
//                        else {
//                            String vals = String.valueOf(val);
//                            for (int x = 0; x < vals.length(); x++) {
//                                chars[k++] = vals.charAt(x);
//                            }
//                        }
//                    }
//                    hs.put(chars[i], 0);
//                }
//            }
//        }
//        String ans=sb.toString();
//        chars=ans.toCharArray();
//        return ans.length();

    }
}
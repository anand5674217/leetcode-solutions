class Solution {
    public String gcdOfStrings(String str1, String str2) {

        int n=str1.length();
        int m=str2.length();
        if(str1.charAt(0)!=str2.charAt(0)){
            return "";
        }

        int i=0; String subString="";
        for(int j=i;j<n;j++){
            subString=str1.substring(i,j+1);
            int idx=j+1;
            int k=j;
            while(k<n){
                String newS=str1.substring(k,k+subString.length());
                if(!newS.equals(subString)){
                    break;
                }else{
                    k+=subString.length();
                }
            }
        }
        return subString;
    }
}
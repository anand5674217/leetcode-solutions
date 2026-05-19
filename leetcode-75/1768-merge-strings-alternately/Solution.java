class Solution {
    public String mergeAlternately(String word1, String word2) {

        int len1=word1.length();
        int len2=word2.length();

        int i=0,j=0;
        StringBuilder sb= new StringBuilder();
        while(i<len1 && j<len2){

            sb.append(word1.charAt(i));

            sb.append(word2.charAt(j));

            i++;j++;

        }

        if(i<len1){
            sb.append(word1.substring(i,len1));
        }
        if(j<len2){
            sb.append(word2.substring(j,len2));
        }

        return sb.toString();
    }
}
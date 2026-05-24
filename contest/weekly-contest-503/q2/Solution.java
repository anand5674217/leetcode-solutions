class Solution {
    public int passwordStrength(String password) {
    HashSet<Character> hs=new HashSet<>();
    int sum=0;
     for(char c:password.toCharArray()){
         if(hs.contains(c)) continue;
         if(Character.isDigit(c)) sum+=3;
         if(Character.isUpperCase(c)) sum+=2;
         if(Character.isLowerCase(c)) sum+=1;
         if(c=='@'||c=='#'||c=='$'||c=='!') sum+=5;

         hs.add(c);
     }
     return sum;
    }
}

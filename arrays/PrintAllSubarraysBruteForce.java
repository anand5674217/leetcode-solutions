public class PrintAllSubarraysBruteForce {

    public static void main(String[] args){

        String A="anand";
        int size=0,max=-1;
        String ans="";
        int n=A.length();
        System.out.println( longestPalindrome(A));
        for(int i=0;i<n;i++) {
            for (int j = i; j < n; j++) {
                print(i,j,A);
            }
        }

    }

    static void print(int i,int j,String A){

        System.out.println(A.substring(i,j+1));
    }


    public static String longestPalindrome(String A) {

        int size=0,max=-1;
        String ans="";
        int n=A.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){

                if(checkIfPal(i,j,A)){
                    size=j-i+1;
                    if(size>max){
                        max=size;
                        ans=A.substring(i,j+1);
                    }
                }
            }
        }
        return ans;
    }

    public static boolean checkIfPal(int i,int j, String A){

        while(i<=j){
            char ai=A.charAt(i);
            char aj=A.charAt(j);
            if(ai!=aj){
                return false;
            }
            i++;j--;
        }
        return true;
    }
}
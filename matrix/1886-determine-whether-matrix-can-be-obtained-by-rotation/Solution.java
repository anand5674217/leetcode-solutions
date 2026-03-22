class Solution {
    public boolean findRotation(int[][] mat, int[][] tar) {


        int n=mat.length;
        int m=mat[0].length;

        int cnt1=0,tar1=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                if(mat[i][j]==1){
                    cnt1++;
                }
                if(tar[i][j]==1){
                    tar1++;
                }
            }
        }

        if(tar1!=cnt1){
            return false;
        }
        // check 0 rotation
        boolean nomatch = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] != tar[i][j]) {
                    nomatch = true;
                    break;
                }
            }
        }
        if (!nomatch) {
            return true;
        }


        //1st turn
        int ra1[][]= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ra1[i][j]=mat[j][n-i-1];
            }
        }
        nomatch=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                if(ra1[i][j]!=tar[i][j]){
                    nomatch=true;
                    break;
                }

            }
        }

        if(!nomatch){
            return true;
        }
        mat=ra1;
        ra1= new int[n][m];
        nomatch=false;
        //rotateagain
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ra1[i][j]=mat[j][n-i-1];
            }
        }
        nomatch=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                if(ra1[i][j]!=tar[i][j]){
                    nomatch=true;
                    break;
                }

            }
        }
        if(!nomatch){
            return true;
        }
        mat=ra1;ra1= new int[n][m];
        nomatch=false;
        //rotateagain
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ra1[i][j]=mat[j][n-i-1];
            }
        }
        nomatch=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                if(ra1[i][j]!=tar[i][j]){
                    nomatch=true;
                    break;
                }

            }
        }

        if(!nomatch){
            return true;
        }
        return false;
    }
}
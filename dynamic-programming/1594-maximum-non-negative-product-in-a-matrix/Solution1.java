package com.anand.leetcode-solutions;
public class Solution1 {

    /**
     *
     * this approach has failed as it will go through all the routes. We might have to use memoization to control this.
     * waht i was doing in this is , I was hoing through all the paths through recursion and also passing previious product value.Once, it reaches terminal
     * state, it will check the max value and then store it in max Variable which is at class level.
     *
     * for this test case it has failed -
     *
     * [[2,-3,4,-1,3,-1,4,3,-4,2,0,2,-1,4,3],[2,-2,-3,1,3,0,-4,-2,0,0,-1,-4,1,-3,-2],[-2,0,1,-2,-2,-2,1,0,3,1,-2,2,-3,0,-3],[0,-4,2,0,-1,-2,3,-4,0,4,-2,-4,2,-1,2],[0,-3,3,3,4,-3,-2,4,-1,4,-2,3,3,0,-1],[3,-1,-4,1,-4,-1,2,4,4,2,1,-1,-4,3,-1],[1,-1,2,-1,4,2,-1,0,4,2,4,2,-2,0,-3],[-4,-1,1,3,-1,-2,-1,-2,-2,2,-2,-3,-4,2,0],[-1,-1,-2,0,-4,0,-4,-4,-2,-2,-4,-2,-4,1,2],[1,-1,-1,3,0,3,4,0,3,-1,0,-1,4,-4,2],[-3,2,-2,-1,3,4,-1,-2,2,4,3,4,2,2,4],[1,-2,-4,-4,1,-2,1,-3,4,4,-1,2,-3,-3,3],[-2,2,0,3,-2,0,-1,-4,-4,-2,-4,3,-3,-2,-2],[2,1,1,3,-4,-2,0,2,1,2,2,3,-1,3,3],[-4,-1,0,-3,4,1,1,4,-4,-1,1,4,4,-3,-4]]
     */


    long max=-1;
    public int maxProductPath(int[][] grid) {



        int n=grid.length;
        int m=grid[0].length;

        handle(0,0,n,m,grid,1);

        if(max<0){
            return -1;
        }else{
            return (int) (max%(1000000007));
        }
    }


    public void handle(int i,int j,int n,int m,int[][] grid,long prod){


        if(i==n-1 && j==m-1){
            long bal= prod*grid[i][j];
            if(bal>max){
                max=bal;
            }
        }

        if((j+1)<m)
            handle(i,j+1,n,m,grid,prod*grid[i][j]);

        if((i+1)<n)
            handle(i+1,j,n,m,grid,prod*grid[i][j]);

    }

}
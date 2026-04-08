import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    class Pair {
        int start;
        int end;

        Pair(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public int solve(int[][] A) {
        int n=A.length;
        ArrayList<Pair> pairList= new ArrayList();
        for(int i=0;i<n;i++){

            Pair p= new Pair(A[i][0],A[i][1]);
            pairList.add(p);
        }

        Collections.sort(pairList,(a,b)-> a.start-b.start);
        //pairList.forEach(System.out.print());

        int cnt=1;
        int st=pairList.get(0).start;
        int en=pairList.get(0).end;
        for(int i=1;i<pairList.size();i++){

            int tst=pairList.get(i).start;
            int ten=pairList.get(i).end;

            if(tst>st && tst<en){
                cnt++;
            }
            st=tst;en=ten;
        }

        return cnt;
    }
}

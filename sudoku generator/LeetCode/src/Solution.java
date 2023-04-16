
import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public static int[][] kClosest(int[][] points, int k) {
        int ans[][]= new int[k][2];
        PriorityQueue <int[]> pq = new PriorityQueue<>((a,b)->calc(a)-calc(b));
        
        for(int x[]:points){
            pq.add(x);
        }
        int i=0;
        while(k>0){
            int []x = pq.poll();
            ans[i][0] = x[0];
            ans[i][1] = x[1];
            i++;
            k--;
        }
        return ans;
    }
    
    public static int calc(int []x){
        return x[0]*x[0] + x[1]*x[1];
    }
    public static void main(String args[]){
        System.out.println(Arrays.deepToString(kClosest(new int [][]{{1,3},{-2,2}},1)));
    }
}

import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        
        if(isParallel(new int[][]{dots[0], dots[1]}, new int[][]{dots[2], dots[3]})) return 1;
        if(isParallel(new int[][]{dots[0], dots[2]}, new int[][]{dots[1], dots[3]})) return 1;
        if(isParallel(new int[][]{dots[0], dots[3]}, new int[][]{dots[1], dots[2]})) return 1;
        
        return 0;
    }
    
    boolean isParallel(int[][] line1, int[][] line2){
        double inc1 = (double)Math.abs(line1[0][0] - line1[1][0]) / Math.abs(line1[0][1] - line1[1][1]);
        double inc2 = (double)Math.abs(line2[0][0] - line2[1][0]) / Math.abs(line2[0][1] - line2[1][1]);
        
        return inc1 == inc2;
    }
}
class Solution {
    public int solution(int[][] dots) {
        int[] oneQ = dots[0];
        int[] threeQ = dots[0];
        for(int i = 0; i < 4; i++){
            if(oneQ[0] <= dots[i][0] && oneQ[1] <= dots[i][1]) oneQ = dots[i];
            if(threeQ[0] >= dots[i][0] && threeQ[1] >= dots[i][1]) threeQ = dots[i];
        }
        return  (threeQ[0] - oneQ[0]) * (threeQ[1] - oneQ[1]);
    }
}
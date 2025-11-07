class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int max = Math.max(sides[0], Math.max(sides[1], sides[2]));
        int triangle = sides[0]+sides[1]+sides[2];
        
        if(triangle - max > max) {
            return 1;
        } else {
            return 2;
        }
    }
}
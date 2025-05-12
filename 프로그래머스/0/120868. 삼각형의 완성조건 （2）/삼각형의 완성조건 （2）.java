class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int s;
        int l;
        if(sides[0] > sides[1]) {
            s = sides[1];
            l = sides[0];
        } else { 
            s = sides[0];
            l = sides[1];
        }
        
        for(int i = l-s+1; i <= s+l-1; i++) answer++;
        
        return answer;
    }
}
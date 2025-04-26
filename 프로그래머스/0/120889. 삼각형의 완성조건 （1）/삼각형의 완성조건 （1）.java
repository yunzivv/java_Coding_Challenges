class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int max;
        if(sides[0] > sides[1] && sides[0] > sides[2]){
            max = sides[0];
        } else if(sides[1] > sides[0] && sides[1] > sides[2]) {
            max = sides[1];
        } else {
            max = sides[2];
        }
        
        int triangle = sides[0]+sides[1]+sides[2];
        if(triangle - max > max) {
            answer = 1;
        } else {
            answer = 2;
        }
        return answer;
    }
}
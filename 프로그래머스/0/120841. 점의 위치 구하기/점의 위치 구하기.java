class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        boolean x = dot[0] > 0;
        boolean y = dot[1] > 0;
        
        if(x && y) {
            answer = 1;
        } else if(x == false && y == true) {
            answer = 2;
        } else if(x == false && y == false) {
            answer = 3;
        } else {
            answer = 4;
        }
        return answer;
    }
}
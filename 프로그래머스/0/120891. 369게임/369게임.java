class Solution {
    public int solution(int order) {
        int answer = 0;
        int three = 0;
        while(order > 0){
            three = order % 10;
            if(three == 0){
                order /= 10;
                continue;
            } else if(three % 3 == 0){
                answer += 1;
            }
            order /= 10;
        }
        return answer;
    }
}
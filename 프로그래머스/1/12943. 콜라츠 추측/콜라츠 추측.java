class Solution {
    public int solution(int num) {

        if(num == 1)return 0;
        int answer = 0;
        while(num != 1){
            if(answer >= 400) {
                answer = -1;
                break;
            }
            if(num % 2 == 0) num /= 2;
            else num = num * 3 + 1;
            answer++;

        }
        return answer;
    }
}
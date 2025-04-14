class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        int a = 0;
        while(num > 0){
            a++;
            if(num % 10 == k){
                answer = a;
            }
            num /= 10;
        }
        if(answer != -1){
            return a-answer+1;
        }
        return answer;
    }
}
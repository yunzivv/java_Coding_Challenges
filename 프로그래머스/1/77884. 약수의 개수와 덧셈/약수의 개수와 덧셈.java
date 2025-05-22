class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++){
            if(div(i) % 2 == 0) answer += i;
            else answer -= i;
        }
        
        return answer;
    }
    
    public int div(int num){
        int answer = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0) answer++;
        }
        return answer;
    }
}
class Solution {
    public int solution(int n) {
        int answer = 1;
        for(int i = 1; i < n; i++){
            int sum = 0;
            for(int j = i; j <= n - (n/2); j++){
                if(sum >= n) break;
                sum += j;
            }
            if(sum == n) answer++;
        }
        return answer;
    }
}
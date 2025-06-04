class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int y = n;
        int x = m;
        
        for(int i = 1; i <= n; i++){
            if(n % i == 0 && m % i == 0)y = i;
        }
        for(int i = n* m; i >= m; i--){
            if(i % n == 0 &&  i % m == 0) x = i;
        }
        answer[0] = y;
        answer[1] = x;
        
        return answer;
    }
}
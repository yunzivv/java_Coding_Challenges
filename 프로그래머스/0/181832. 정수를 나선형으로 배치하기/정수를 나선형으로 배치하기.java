class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int MAX = 0;
        if(n % 2 == 0) {
            MAX = n / 2;
        }else {
            MAX = n / 2 + 1;
            answer[MAX - 1][MAX - 1] = n * n;
        }
        int counter = 1;
        for(int i = 0; i < MAX; i++){
            int x = i, y = i;
            
            for(;y < n - (1 + i); y++){
                answer[x][y] = counter++;
            }
            for(;x < n - (1 + i); x++){
                answer[x][y] = counter++;
            }
            for(;y > i; y--){
                answer[x][y] = counter++;
            }

            for(;x > i; x--){
                answer[x][y] = counter++;
            }
        }
        return answer;
    }
}
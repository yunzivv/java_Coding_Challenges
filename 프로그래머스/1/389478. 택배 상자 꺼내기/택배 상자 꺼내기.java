class Solution {
    public int solution(int n, int w, int num) {
        
         int answer = 0;
        int[][] tower = new int[(int) Math.ceil((double) n /w)][w];
        int box = 0;

        for(int i = 0; i < tower.length; i++){
            if(i % 2 == 0){
                for(int j = 0; j < tower[i].length; j++) {
                    tower[i][j] = ++box;
                    if(box == n) break;
                }
            } else {
                for(int j = tower[i].length - 1; j >= 0; j--) {
                    tower[i][j] = ++box;
                    if(box == n) break;
                }
            }

        }

        int row = (num - 1) / w;
        int col = (num - 1) % w;

        int idx = (row % 2 == 0) ? col : (w - 1 - col);

        for(int i = tower.length - 1; i >= 0; i--){
            if(tower[i][idx] == 0) continue;
            answer++;
            if(tower[i][idx] == num) break;
        }

        return answer;
    }
}
import java.util.*;

class Solution {
    int solution(int[][] land) {
        int len = land.length;

        if(len == 1){
            Arrays.sort(land[0]);
            return land[0][3];
        }

        for(int i = 1; i < len; i++){
            for(int j = 0; j < 4; j++){
                int n = land[i][j];
                for(int k = 0; k < 4; k++){
                    if(j == k) continue;

                    land[i][j] = Math.max(land[i][j], n + land[i - 1][k]);
                }
            }
        }

        Arrays.sort(land[len - 1]);
        return land[len - 1][3];
    }
}
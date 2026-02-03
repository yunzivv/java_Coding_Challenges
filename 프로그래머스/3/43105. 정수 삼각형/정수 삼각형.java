import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;
        int len = triangle.length;
        int[][] maxRoot = new int[len][len];
        maxRoot[0][0] = triangle[0][0];

        for(int i = 0; i < len - 1; i++){
            for(int j = 0; j < triangle[i].length; j++){
                int now = maxRoot[i][j];
                maxRoot[i + 1][j] = Math.max(maxRoot[i + 1][j], triangle[i + 1][j] + now);
                maxRoot[i + 1][j + 1] = Math.max(maxRoot[i + 1][j + 1], triangle[i + 1][j + 1] + now);
            }
            //System.out.println(Arrays.toString(maxRoot[i+1]));
        }
        return Arrays.stream(maxRoot[len - 1]).max().getAsInt();
    }
}
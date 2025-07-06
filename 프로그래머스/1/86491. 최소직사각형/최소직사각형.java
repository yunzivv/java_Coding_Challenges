import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int width = 0;
        int height = 0;
        for(int i = 0; i < sizes.length; i++){
            Arrays.sort(sizes[i]);
        }
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] > width) width = sizes[i][0];
        }
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][1] > height) height = sizes[i][1];
        }
        return width * height;
    }
}
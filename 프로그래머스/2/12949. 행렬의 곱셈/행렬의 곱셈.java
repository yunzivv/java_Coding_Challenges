class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        
        int row = arr1.length;
        int index = arr1[0].length;
        int column = arr2[0].length;
        
        
        int[][] answer = new int[row][column];
        
        for(int r = 0; r < row; r++){
            for(int c = 0; c < column; c++){
                for(int e = 0; e < index; e++){
                    answer[r][c] += arr1[r][e] * arr2[e][c];
                }
            }
        }
        
        return answer;
    }
}
class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int index = 0;
        char[][] table = new char[my_string.length() / m][m];
        for(int i = 0; i < my_string.length()/m; i++){
            for(int j = 0; j < m; j++){
                table[i][j] = my_string.charAt(index);
                index++;
            }
        }
        
        for(int i = 0; i < my_string.length()/m; i++){
            answer += table[i][c-1];
        }
        return answer;
    }
}
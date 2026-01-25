class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        String s = "";
        
        for(int i = 0; s.length() < t * m; i++){ s += Integer.toString(i, n);}
        for(int i = p - 1; i < t * m; i += m){
            answer += Character.toUpperCase(s.charAt(i)) + "";
        }        
        return answer;
    }
}
class Solution {
    public String solution(String s, int n) {
        String answer = ""; 
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c <= 'Z' && c + n > 'Z') c -= 26;
            if(c > 'Z' && c + n > 'z') c -= 26;
            if(c != ' ') c += n;
            answer += String.valueOf(c);
        }
        return answer;
    }
}
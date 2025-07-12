class Solution {
    public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        int i = 0;
        for(int j = 0; j < s.length(); j++){
            char c = s.charAt(j);
            i++;
            if(c == ' '){
                i = 0;
                answer += " ";
                continue;
            }
            if(i % 2 == 1) {
                c -= 32;
                answer += String.valueOf(c);
            }
            else answer += String.valueOf(c);
        }
        return answer;
    }
}
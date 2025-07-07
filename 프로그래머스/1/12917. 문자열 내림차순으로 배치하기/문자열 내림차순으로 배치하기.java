import java.util.*;

class Solution {
    public String solution(String s) {
        char[] chars = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            chars[i] = s.charAt(i);
        }
        Arrays.sort(chars);
        String answer = "";
        
        for(int i = s.length() - 1; i >= 0; i--){
            answer += String.valueOf(chars[i]);
        }
        
        return answer;
    }
}
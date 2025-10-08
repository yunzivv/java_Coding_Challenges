import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for(int i = 0; i < s.length(); i++){
            
            if (! (s.contains("{}") || s.contains("[]") || s.contains("()"))) continue;
            
            int lg = 0, md = 0, sm = 0;
            
            for(char c : s.toCharArray()){
                if(c == '[') lg++;
                if(c == ']') lg--;
                if(c == '{') md++;
                if(c == '}') md--;
                if(c == '(') sm++;
                if(c == ')') sm--;
                
                if(lg < 0 || md < 0 || sm < 0) break;
                
            }
            if(lg == 0 && md == 0 && sm == 0) answer++;
            s = s.substring(1) + s.substring(0,1);
        }
        return answer;
    }
}
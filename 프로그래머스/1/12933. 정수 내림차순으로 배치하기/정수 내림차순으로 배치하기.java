import java.util.*;

class Solution {
    public long solution(long n) {
        String s = "" + n;
        String[] ss = new String[s.length()];
        for(int i = 0; i < s.length(); i++){
            ss[i] = String.valueOf(s.charAt(i));
        }
        Arrays.sort(ss);
        s = "";
        for(int i = ss.length - 1; i >= 0; i--){
            s += ss[i];
        }
        
        long answer = Long.parseLong(s);
        
        return answer;
    }
}
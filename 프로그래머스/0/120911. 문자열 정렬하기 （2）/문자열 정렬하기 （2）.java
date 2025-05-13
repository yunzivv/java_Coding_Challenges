import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] toString = my_string.toCharArray();

        for (int i = 0; i < toString.length; i++) {
            if (toString[i] < 'a') toString[i] += 32;
        }
        Arrays.sort(toString);
        for (int i = 0; i < toString.length; i++) {
            answer += toString[i];
        }
        return answer;
    }
}

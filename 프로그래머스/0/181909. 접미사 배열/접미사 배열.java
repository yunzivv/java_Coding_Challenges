import java.util.Arrays;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        int index = 0;
        for(int i = my_string.length()-1; i >= 0; i--){
            String suffix  = "";
            for(int j = my_string.length()-1; j >= i; j--){
                suffix = my_string.charAt(j) + suffix;
            }
            answer[index] = suffix;
            index++;
        }
        String temp;
        Arrays.sort(answer);
        return answer;
    }
}
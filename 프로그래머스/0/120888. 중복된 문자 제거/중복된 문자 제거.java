import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] an = my_string.split("");
        List<String> ans = new ArrayList<>(Arrays.asList(an));

        for(int i = my_string.length() - 1; i > -1; i--){
            for(int j = i - 1; j >= 0; j--){
                if(my_string.charAt(i) == my_string.charAt(j)){
                    ans.remove(i);
                    break;
                }
            }
        }

        for(int i = 0; i < ans.size(); i++){
            answer += ans.get(i);
        }
        return answer;
    }
}
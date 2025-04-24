import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        int index;
        String[] answer = {};
        for(index = 0; index < str_list.length; index++){
            if(str_list[index].equals("l")){
                return Arrays.copyOfRange(str_list, 0, index);
            }else if(str_list[index].equals("r")){
                return Arrays.copyOfRange(str_list, index+1, str_list.length);
            }
            
        }
        return answer;
    }
}
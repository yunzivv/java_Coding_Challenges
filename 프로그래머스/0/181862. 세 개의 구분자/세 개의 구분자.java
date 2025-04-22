import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replace("a", ".").replace("b", ".").replace("c", ".");
        String[] str = myStr.split("\\.");
        List<String> list = new ArrayList<>(Arrays.asList(str));
        while (list.remove("")) { 
        };
        if(list.size() == 0){
            String[] a = {"EMPTY"};
            return a;
        }
        String[] answer = list.toArray(new String[list.size()]);
        return answer;
    }
}
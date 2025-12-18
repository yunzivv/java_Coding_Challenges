import java.util.*;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        
        for(String[] s : clothes){
            if(!map.containsKey(s[1])) map.put(s[1], 1);
            else map.replace(s[1], map.get(s[1]) + 1);
        }
        
        
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            answer *= (entry.getValue() + 1);
        }
        
        return answer - 1;
    }
}
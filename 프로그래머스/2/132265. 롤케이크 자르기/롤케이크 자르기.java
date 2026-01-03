import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        
        Set<Integer> o = new HashSet<>();
        Map<Integer, Integer> y = new HashMap<>();
            
        for(int i = 0; i < topping.length; i++){
            if(y.containsKey(topping[i])) y.put(topping[i], y.get(topping[i]) + 1);
            else y.put(topping[i], 1);
        }
        
        for(int i = 0; i < topping.length - 1; i++){
            o.add(topping[i]);
            if(y.get(topping[i]) > 1) y.put(topping[i], y.get(topping[i]) - 1);
            else y.remove(topping[i]);
            
            if(o.size() == y.size()) answer++;
        }
        
        return answer;
    }
}
import java.util.*;
import java.util.Collection;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i : tangerine){
            if(map.containsKey(i)) map.put(i, map.get(i) + 1);
            else map.put(i, 1);
        }
        
        List<Integer> values = new ArrayList<>(map.values());
        values.sort(Comparator.reverseOrder());
        
        while(k > 0){
            k -= values.get(0);
            values.remove(0);
            answer++;
        }
        
        return answer;
    }
}
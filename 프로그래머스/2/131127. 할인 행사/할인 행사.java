import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        for(int i = 0; i <= discount.length - 10; i++){ 

            Map<String, Integer> map = new HashMap<>();
            
            for(int w = 0; w < want.length; w++){
                map.put(want[w], number[w]);
            }

            for(int j = i; j < i + 10; j++){
                if(map.containsKey(discount[j])){
                    if(map.get(discount[j]) - 1 == 0) map.remove(discount[j]);
                    else map.replace(discount[j], map.get(discount[j]) - 1);
                }
            }
            if(map.isEmpty()) answer++; 
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        
        int answer = 0;
        int index = 0;
        
        List<Integer> list = new ArrayList<>();
        for (int p : priorities) list.add(p);
        list.sort(Collections.reverseOrder());
        
        while(list.size() > 0){
            answer++;
            
            int queue = list.remove(0);
            
            while(true){
                if(priorities[index % priorities.length] == queue){
                    priorities[index % priorities.length] = 0;
                    break;
                }
                index++;
            }
            
            if(priorities[location] == 0) break;
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        int step = 0;
        boolean flag;
        
        Map<String, Integer> map = new HashMap<>(skill.length());
        for(char c : skill.toCharArray()) map.put(c + "", ++step);
        
        for(String s : skill_trees){
            flag = false;
            step = 0;
            
            for(char c : s.toCharArray()){
                if(!map.containsKey(c + "")) continue;
                
                if(map.get(c + "") == 1 + step){
                    step++;
                } else {
                    flag = true;
                    break;
                }
            }
            
            if(flag) continue;
            answer++;
        }
        
        return answer;
    }
}
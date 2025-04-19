import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> rs = new ArrayList<>();
        for(int i = 0; i < intStrs.length; i++){
            int a = Integer.parseInt(intStrs[i].substring(s, s+l));
            if(a > k){
                rs.add(a);
            }
        }
        
        int[] answer = new int[rs.size()];
        for(int i = 0; i < rs.size(); i++){
            answer[i] = rs.get(i);
        }
        return answer;
    }
}
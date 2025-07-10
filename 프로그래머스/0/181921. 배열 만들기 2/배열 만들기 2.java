import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> nums = new ArrayList<>();
        for(int i = l; i <= r; i++){
            if(String.valueOf(i).contains("1") || String.valueOf(i).contains("2")
              ||String.valueOf(i).contains("3")||String.valueOf(i).contains("4")
               ||String.valueOf(i).contains("6")||String.valueOf(i).contains("7")
               ||String.valueOf(i).contains("8")||String.valueOf(i).contains("9")) continue;
            nums.add(i);
        }
        if(nums.size() == 0){
            int[] answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        int[] answer = new int[nums.size()];
        for(int i = 0; i < nums.size(); i++){
            answer[i] = nums.get(i);
        }
        return answer;
    }
}
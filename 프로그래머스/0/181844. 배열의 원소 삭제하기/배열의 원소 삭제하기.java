import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<>();
        for(int a : arr){
            boolean exist = true;
            for(int d : delete_list){
                if(a == d) exist = false;
            }
            if(exist) list.add(a);
        }
        
        int[] answer = list.stream().mapToInt(i -> i).toArray();
        
        return answer;
    }
}
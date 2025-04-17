import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < flag.length; i++){
            if(flag[i]){
                for(int j = 0; j < arr[i]*2; j++){
                    result.add(arr[i]);
                }
            }else {
                for(int j = arr[i]; j > 0; j--){
                    result.remove(result.size() - 1);
                }
            }
        }
        
        int[] answer = result.stream()
                .mapToInt(i -> i)
                .toArray();

        return answer;
    }
}
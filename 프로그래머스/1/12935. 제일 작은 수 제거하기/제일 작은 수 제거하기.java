import java.util.*;

class Solution {
    public int[] solution(int[] arr) {

        int min = Arrays.stream(arr).min().getAsInt();
        int[]answer = new int[arr.length - 1];

        if(answer.length == 0) return new int[]{-1};
        int index = 0;
        for(int i : arr){
            if(i == min) continue;
            answer[index++] = i;
        }

        return answer;
    }
}
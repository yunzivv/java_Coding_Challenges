import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] temp = new int[score.length];
        int index = 0;
        for(int i = score.length-1; i >= 0; i--){
            temp[i] = score[index];
            Arrays.sort(temp);
            if(index < k) answer[index++] = temp[i];
            else answer[index++] = temp[score.length - k];
        }
        return answer;
    }
}
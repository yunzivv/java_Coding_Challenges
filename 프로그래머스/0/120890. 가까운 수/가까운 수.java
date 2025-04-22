import java.lang.*;
 class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int diff = 100;
        for(int i = 0; i < array.length; i++){
            int thisdiff = Math.abs(array[i] - n);
            if(diff > thisdiff) {
                diff = thisdiff;
                answer = array[i];
            } else if(diff == thisdiff) {
                answer = answer > array[i] ? array[i] : answer;
            }
        }
        return answer;
    }
}
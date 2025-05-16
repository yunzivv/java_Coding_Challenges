import java.util.*;
class Solution {
    public int[] solution(int[] arr) {

        int first = -1;
        int last = -1;
        int[] a = {-1};
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 2) {
                first = i;
                break;
            }
        }
        if(first == -1) return a;

        for(int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] == 2) {
                last = i;
                break;
            }
        }
        int[] answer = new int[last - first + 1];
        int index = 0;
        for(int i = first; i <= last; i++) {
            answer[index++] = arr[i];
        }
        return answer;
    }
}
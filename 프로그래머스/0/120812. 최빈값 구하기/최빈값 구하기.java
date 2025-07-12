import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;
        int[] counts = new int[1000];
        Arrays.sort(array);
        for(int i = 0; i < array.length; i++){
            counts[array[i]]++;
        }
        for(int i = 0; i < 1000; i++){
            if(max <= counts[i]){
                max = counts[i];
                answer = i;
            }
        }
        int[] a = counts;
        Arrays.sort(a);
        if(a[999] == a[998])return -1;
        return answer;
    }
}
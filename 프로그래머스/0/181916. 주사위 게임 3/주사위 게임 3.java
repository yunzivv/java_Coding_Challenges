import java.util.stream.*;
import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 1;
        int[] arr = {a, b, c, d};
        int[] newArr = IntStream.of(a, b, c, d).distinct().toArray();
        Arrays.sort(arr);
        Arrays.sort(newArr);
        
        if(newArr.length == 1) return a * 1111;
        if(newArr.length == 2) {
            int q = 0, p = 0;
            for(int i : arr){
                if(i == newArr[0]) q++;
                else p++;
            }
            int triple = q == 3 ? newArr[0] : newArr[1];
            int other = q == 3 ? newArr[1] : newArr[0];
            if(q != p) return (int) Math.pow(10 * triple + other, 2);
            else return (newArr[0] + newArr[1]) * Math.abs(newArr[0] - newArr[1]);
        }
        if(newArr.length == 3){
            int p = 0;
            for(int i : arr){
                if(p == i) break;
                p = i;
            }
        
            for(int i : newArr){
                answer = i == p ? answer * 1 : answer * i;
            }
            return answer;
        }
        return newArr[0];
    }
}
import java.util.*;
class Solution {
    public int solution(String after, String before) {
        int len = after.length();
        int[] a = new int[len];
        int[] b = new int[len];
        for(int i = 0; i < len; i++){
            a[i] = after.charAt(i);
            b[i] = before.charAt(i);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i = 0; i < len; i++){
            if(a[i] != b[i]){
                return 0;
            }
        }
        return 1;
    }
}
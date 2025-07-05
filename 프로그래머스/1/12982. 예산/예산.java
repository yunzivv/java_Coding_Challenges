import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int sum = 0;
        if(d.length == 1 && d[0] > budget) return 0;
        for(int i = 0; i < d.length; i++){
            answer++;
            sum += d[i];
            if(i == d.length - 1)break;
            if(sum + d[i + 1] > budget)break;
        }
        return answer;
    }
}
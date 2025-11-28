import java.util.Arrays;

class Solution {
    public int solution(int[] people, int limit) {
        
        Arrays.sort(people);
        int answer = 0;
        int big = people.length - 1;
        int small = 0;
        
        while(small < big){
            if(people[small] + people[big] <= limit) small++;
            big--;
            answer++;
        }
        
        return answer + (small == big ? 1 : 0);
    }
}
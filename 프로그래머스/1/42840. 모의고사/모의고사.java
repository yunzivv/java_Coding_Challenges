import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] su1 = {1,2,3,4,5};
        int[] su2 = {2,1,2,3,2,4,2,5};
        int[] su3 = {3,3,1,1,2,2,4,4,5,5};
        
        int[] score = new int[3];
        
        for(int i = 0; i < answers.length; i++){
            if(answers[i] == su1[i % 5]) score[0]++;
            if(answers[i] == su2[i % 8]) score[1]++;
            if(answers[i] == su3[i % 10]) score[2]++;
        }
        
        int max = Arrays.stream(score).max().getAsInt();
        
        int[] answer = Arrays.stream(new int[]{0, 1, 2})
                  .filter(i -> score[i] == max)
                  .map(i -> i + 1)
                  .toArray();
        
        return answer;
    }
}

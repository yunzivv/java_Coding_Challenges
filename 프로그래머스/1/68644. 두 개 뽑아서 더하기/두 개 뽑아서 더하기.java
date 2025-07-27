import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer; 
        int[] preAns = new int[200];
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j){
                    continue;
                }
                int value = numbers[i] + numbers[j];
                boolean TNF = false;
                for (int k = 0; k < count; k++) {
                    if (value == preAns[k]) {
                        TNF = true;
                        continue;
                    }
                }
                if (!TNF){
                    preAns[count] = value;
                    count ++;
                }
            }
        }

        answer = new int[count];

        for (int i = 0; i < count; i++) {
            answer[i] = preAns[i];
        }
        Arrays.sort(answer);

        return answer;
    }
}
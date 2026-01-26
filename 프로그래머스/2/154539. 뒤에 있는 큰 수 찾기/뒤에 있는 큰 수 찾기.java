import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int n = numbers.length;
        int[] answer = new int[n];
        Arrays.fill(answer, -1);
        
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && numbers[stack.peekLast()] < numbers[i]) {
                int idx = stack.pollLast();
                answer[idx] = numbers[i];
            }
            stack.addLast(i);
        }
        
        return answer;
    }
}
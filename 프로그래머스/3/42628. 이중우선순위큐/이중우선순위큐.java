import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];

        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> min = new PriorityQueue<>();

        for(String s : operations){
            char c = s.charAt(0);
            int n = Integer.parseInt(s.split(" ")[1]);
            if(c == 'I'){
                max.add(n);
                min.add(n);
            } else {
                if(n == 1) min.remove(max.poll());
                else max.remove(min.poll());
            }
        }

        answer[0] = max.size() != 0 ? max.poll() : 0;
        answer[1] = min.size() != 0 ? min.poll() : 0;

        return answer;
    }
}
import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = Arrays.stream(scoville)
        .boxed()
        .collect(Collectors.toCollection(PriorityQueue::new));
        
        while(pq.peek() < K){
            Integer s = pq.poll();
            Integer n = pq.poll();
            if(s == null || n == null) return -1;
            pq.add(s + (n *2));
            answer++;
        }
        
        return answer;
    }
}
import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int work : works) heap.add(work);
        
        for(int i = 0; i < n; i++){
            int work = heap.poll();
            if(work == 0) return 0;
            heap.add(work - 1);
        }
        
        for(int work : heap) answer += Math.pow(work, 2);
        
        return answer;
    }
}
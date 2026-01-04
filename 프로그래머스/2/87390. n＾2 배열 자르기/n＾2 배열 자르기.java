class Solution {
    public int[] solution(int n, long left, long right) {
        
        int[] answer = new int[Long.valueOf(right - left).intValue() + 1];
        int index = 0;
        
        for(long i = left; i <= right; i++){
            Long q = i / n;
            Long r = i % n;
            if(r > q) answer[index++] = 1 + r.intValue();
            else answer[index++] = 1 + q.intValue();
        }
        
        return answer;
    }
}
class Solution {
    public int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = Long.valueOf(n % 10).intValue();
            n /= 10;
        }
        return answer;
    }
}
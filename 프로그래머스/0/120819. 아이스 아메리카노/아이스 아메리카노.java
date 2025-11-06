class Solution {
    public int[] solution(int money) {
        int[] answer = {0, money};
        while(answer[1] >= 5500) {
            answer[0]++;
            answer[1] -= 5500; 
        }
        return answer;
    }
}
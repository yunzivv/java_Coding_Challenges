class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int coffee = 0;
        while(money >= 5500) {
            money -= 5500;
            coffee++;
        }
        answer[0] = coffee;
        answer[1] = money;
        return answer;
    }
}
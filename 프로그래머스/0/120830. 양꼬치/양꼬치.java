class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int service;
        answer = n * 12000 + k * 2000;
        if (n >= 10){
            service = n / 10;
            service *= 2000;
            answer -= service;
        }
        return answer;
    }
}
package org.example;

// 프로그래머스 짝수는 싫어요
class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2];
        int odd = 1;
        for(int i = 0; i < (n+1)/2; i++) {
            answer[i] = odd;
            odd += 2;
        }
        return answer;
    }
}
package org.example;

// 프로그래머스 피자 나눠 먹기(1)

class Solution {
    public int solution(int n) {
        int answer = 1;
        while(n > 7) {
            answer++;
            n -= 7;
        }
        return answer;
    }
}
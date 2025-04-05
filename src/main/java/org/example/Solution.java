package org.example;

// 프로그래머스 제곱수 판별하기

class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0) {
                answer++;
            }
        }
        if(answer % 2 == 0) {
            answer = 2;
        } else {
            answer = 1;
        }
        return answer;
    }
}
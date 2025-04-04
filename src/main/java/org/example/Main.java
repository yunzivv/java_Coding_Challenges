package org.example;

// java 코딩 챌린지 세팅

class Solution {
    public int solution(int slice, int n) {
        int answer = 1;
        while(n > slice) {
            n -= slice;
            answer++;
        }
        return answer;
    }
}
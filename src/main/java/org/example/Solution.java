package org.example;

// 프로그래머스 머쓱이보다 키 큰 사람

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        for(int h : array) {
            if(h > height) {
                answer++;
            }
        }
        return answer;
    }
}
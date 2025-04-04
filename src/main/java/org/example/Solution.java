package org.example;

// 프로그래머스 n의 배수 구하기

class Solution {
    public int[] solution(int n, int[] numlist) {
        int a = 0;
        for(int number : numlist) {
            if(number % n == 0) {
                a++;
            }
        }
        int[] answer = new int[a];
        int i = 0;
        for(int number : numlist) {
            if(number % n == 0) {
                answer[i] = number;
                i ++;
            }
        }
        return answer;
    }
}
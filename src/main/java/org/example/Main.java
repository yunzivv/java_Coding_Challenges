package org.example;

// 프로그래머스 입문 배열 자르기

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int a = num2 - num1 + 1;
        int index = 0;
        int[] answer = new int[a];
        for(int i = num1; i <= num2; i++){
            answer[index] = numbers[i];
            index++;
        }
        return answer;
    }
}
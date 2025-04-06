package org.example;

// 프로그래머스 중앙 값 구하기
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int temp;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        answer = array[array.length / 2];
        return answer;
    }
}
package org.example;

// 프로그래머스 짝수 홀수 개수

class Solution {
    public int[] solution(int[] num_list) {
        int even = 0;
        int odd = 0;
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                even++;
            }else {
                odd++;
            }
        }
        int[] answer = {even, odd};
        return answer;
    }
}
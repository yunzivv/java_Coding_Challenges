package org.example;

// 프로그래머스 이어 붙인 수

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int even = 0;
        int odd = 0;
        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) {
                even = even * 10 + num_list[i];
            } else {
                odd = odd * 10 + num_list[i];
            }
        }
        answer = even + odd;
        return answer;
    }
}
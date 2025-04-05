package org.example;

// 프로그래머스 문자 반복 출력하기

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            for(int repeat = 0; repeat < n; repeat++) {
                answer += c;
            }
        }
        return answer;
    }
}
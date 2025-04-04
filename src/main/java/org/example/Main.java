package org.example;

// 프로그래머스 입문 뒤집힌 문자열

class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int a =  my_string.length() - 1; a > -1; a--){
            answer += my_string.charAt(a);
        }
        return answer;
    }
}
package org.example;

// 프로그래머스 모음 제거

class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++) {
            char aeiou = my_string.charAt(i);
            if(aeiou != 'a' && aeiou != 'e' && aeiou != 'i' && aeiou != 'o' && aeiou != 'u' ){
                answer += aeiou;
            }
        }
        return answer;
    }
}
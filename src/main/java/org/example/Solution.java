package org.example;

// 프로그래머스 배열 원소의 길이

class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for(int i = 0; i < strlist.length; i++){
            int lenth = 0;
            for(int j = 0; j < strlist[i].length(); j++){
                lenth++;
            }
            answer[i] = lenth;
        }
        return answer;
    }
}
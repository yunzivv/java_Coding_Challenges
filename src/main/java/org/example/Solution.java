package org.example;

// 프로그래머스 개미 군단
import java.util.Scanner;

class Solution {
    public int solution(int hp) {
        int answer = 0;
        while(hp > 0) {
            if (hp >= 5){
                hp -= 5;
                answer++;
            } else if (hp >=3 ){
                hp -= 3;
                answer++;
            } else if (hp >= 1 ){
                hp -= 1;
                answer++;
            }
        }
        return answer;
    }
}
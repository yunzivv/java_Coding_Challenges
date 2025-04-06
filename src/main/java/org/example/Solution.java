package org.example;

// 프로그래머스 직각삼각형 출력하기
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 1; j <= i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
package com.example.umcstudy.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class No10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] balls = new int[N];

        while(M-- > 0) {
            int current = sc.nextInt()-1;
            int end = sc.nextInt()-1;
            int ball_num = sc.nextInt();
            for(; current<=end; current++) {
                balls[current] = ball_num;
            }
        }

        Arrays.stream(balls)
                .forEach(value -> System.out.print(value + " "));
    }
}
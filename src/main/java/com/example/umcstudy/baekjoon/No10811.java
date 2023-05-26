package com.example.umcstudy.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class No10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] balls = new int[N+1];
        for(int i=1; i<=N; i++) {
            balls[i] = i;
        }

        while (M-- > 0) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            for (; start<end; start++, end--) {
                int tmp = balls[start];
                balls[start] = balls[end];
                balls[end] = tmp;
            }
        }

        for(int i=1; i<=N; i++) {
            System.out.print(balls[i] + " ");
        }
    }
}
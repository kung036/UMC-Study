package com.example.umcstudy.baekjoon;

import java.util.Scanner;

public class No10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] balls = new int[N+1];
        for(int i=1; i<=N; i++) {
            balls[i] = i;
        }

        while(M-- > 0) {
            int switchA = sc.nextInt();
            int switchB = sc.nextInt();
            int tmp = balls[switchB];
            balls[switchB] = balls[switchA];
            balls[switchA] = tmp;
        }

        for(int i=1; i<=N; i++) {
            System.out.print(balls[i] + " ");
        }
    }
}

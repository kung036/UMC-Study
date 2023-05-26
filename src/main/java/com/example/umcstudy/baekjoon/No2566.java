package com.example.umcstudy.baekjoon;

import java.util.Scanner;

public class No2566 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 9;
        int max = -1;
        int row = 0;
        int column = 0;

        for(int i=1; i<=count; i++) {
            for(int j=1; j<=count; j++) {
                int cur = sc.nextInt();
                if(cur > max) {
                    max = cur;
                    row = i;
                    column = j;
                }
            }
        }

        System.out.println(max);
        System.out.println(row + " " + column);
    }
}

package com.example.umcstudy.baekjoon;

import java.util.Scanner;

public class No2563 {
    static boolean[][] papers = new boolean[101][101];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        while(count-- > 0) {
            color(sc.nextInt(), sc.nextInt());
        }

        int area = 0;
        for(int i=0; i<101; i++) {
            for(int j=0; j<101; j++) {
                if(papers[i][j]) area++;
            }
        }
        System.out.println(area);
    }

    public static void color(int x, int y) {
        for(int i=x; i<x+10; i++) {
            for(int j=y; j<y+10; j++) {
                papers[j][i] = true;
            }
        }
    }
}

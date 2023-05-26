package com.example.umcstudy.baekjoon;

import java.util.Scanner;

public class No2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] A = new int[row][column];
        int[][] B = new int[row][column];

        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<row; i++) {
            for(int j=0; j<column; j++) {
                A[i][j] += sc.nextInt();
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}

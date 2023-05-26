package com.example.umcstudy.baekjoon;

import java.util.Scanner;

public class No25314 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = (int)Math.ceil(N/4);

        while(count-- > 0) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}

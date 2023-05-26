package com.example.umcstudy.baekjoon;

import java.util.Scanner;

public class No25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long total = sc.nextLong();
        int num = sc.nextInt();
        while(num-->0) {
            int money = sc.nextInt();
            int count = sc.nextInt();
            for(int i=0; i<count; i++) {
                total -= money;
            }
        }

        if(total == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}

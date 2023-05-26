package com.example.umcstudy.baekjoon;

import java.util.Scanner;

public class No9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            String str = sc.next();
            int len = str.length()-1;
            System.out.println(str.charAt(0) + "" + str.charAt(len));
        }
    }
}
package com.example.umcstudy.baekjoon;

import java.util.Scanner;

public class No2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int add = sc.nextInt();
        int add_hour = 0;

        // 분 확인
        minute += add;
        if(minute >= 60) {
            add_hour = minute/60;
            minute = minute%60;
        }

        // 시간 확인
        hour += add_hour;
        if(hour >= 24) {
            hour %= 24;
        }

        System.out.println(hour + " " + minute);
    }
}

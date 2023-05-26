package com.example.umcstudy.baekjoon;

import java.util.Scanner;

public class No2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dice1 = sc.nextInt();
        int dice2 = sc.nextInt();
        int dice3 = sc.nextInt();
        int money = 0;

        // 같은 눈 3개
        if (dice1 == dice2 && dice2 == dice3) {
            money = 10000 + dice1 * 1000;
        } else if (dice1 == dice2) { // 같은 눈 2개
            money = 1000 + dice1 * 100;
        } else if (dice1 == dice3) {
            money = 1000 + dice1 * 100;
        } else if (dice2 == dice3) {
            money = 1000 + dice2 * 100;
        } else { // 모두 다른 눈
            money = Math.max(dice1, Math.max(dice2, dice3)) * 100;
        }

        System.out.println(money);
    }
}

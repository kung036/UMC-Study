package com.example.umcstudy.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class No10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] nums = new int[num];
        int count = 0;

        for (int i = 0; i < num; i++) {
            nums[i] = sc.nextInt();
        }
        int find = sc.nextInt();
        count = (int) Arrays.stream(nums)
                .filter(value -> value == find)
                .count();

        System.out.println(count);
    }
}

package com.example.umcstudy.baekjoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class No10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String[]> list = new ArrayList<>();
        int count = 5;
        int max_len = 0;

        for(int i=0; i<count; i++) {
            list.add(sc.next().split(""));
            if(list.get(i).length > max_len) max_len = list.get(i).length;
        }

        for(int i=0; i<max_len; i++) {
            for(int j=0; j<count; j++) {
                if(i < list.get(j).length) {
                    System.out.print(list.get(j)[i]);
                }
            }
        }
    }
}
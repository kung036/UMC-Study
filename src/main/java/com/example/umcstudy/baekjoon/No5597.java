package com.example.umcstudy.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class No5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] students = new boolean[31];
        String index;

        while((index = br.readLine()) != null) {
            int i = Integer.parseInt(index);
            students[i] = true;
        }

        for(int i=1; i<=30; i++) {
            if(!students[i]) System.out.println(i);
        }
    }
}

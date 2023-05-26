package com.example.umcstudy.basic;

import java.util.Scanner;

public class BasicException {
    public static void main(String[] args) {
        Input input = new Input();

        try {
            input.result = input.divide();
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("(입력한 값)/10 = " + input.result);
            System.out.println("종료!");
        }
    }
}

class Input {
    static double result;

    public static double divide() {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        return num/10;
    }
}
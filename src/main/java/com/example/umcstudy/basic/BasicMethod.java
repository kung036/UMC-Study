package com.example.umcstudy.basic;

public class BasicMethod {
    public static void main(String[] args) {
        Math math = new Math();
        int even = 10;
        int odd = 11;
        System.out.println("even 변수는 짝수인가? " + math.isEven(even));
        System.out.println("odd 변수는 짝수인가? " + math.isEven(odd));
    }
}

class Math {
    static boolean isEven(int num) {
        if(num%2 == 0) return true;
        else return false;
    }
}
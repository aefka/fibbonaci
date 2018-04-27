package com.company;

import java.util.Scanner;

public class Main {
     public static int fib(int n) {
        if((n == 1) || (n == 2))
            return 1;
        else
            return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ktory wyraz ciagu chcesz obliczyc?");
        int number = read.nextInt();
        System.out.println(number + " wyraz ciagu fibonaciego wynosi " + fib(number));
    }


}


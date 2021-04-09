package com.example.campus.task4;
//Write a program to print Fibonacci series with the given size.
public class PrintFibanocciSeries {
    public static void main(String[] args) {

        fibanocciSeries(12);
    }

    public static void fibanocciSeries(int size) {

        int fib1= 1;
        int fib2=1;
        int fib3=0;
        System.out.print(fib1+","+fib1 + ",");
        for (int i = fib2; i <=size-2 ; i++) {

            fib3 = fib1+fib2;
            fib1=fib2;
            fib2=fib3;
            System.out.print(fib3+",");
        }

    }
}

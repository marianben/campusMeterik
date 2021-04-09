package com.example.campus.task1;

public class ThreeNumbersAverage {
    public static void main(String[] args) {
        System.out.println("Average of 15, 70 and 27 is "+ average(15, 70, 27));
    }

    public static int average(int a, int b, int c){
        int result =0;
            result = (a+b+c)/3;
        return result;
    }
}

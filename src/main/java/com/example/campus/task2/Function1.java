package com.example.campus.task2;
/*
Write a program to get the value of y for a given x where

y = 4x^2 - 22x + 129; // x^2 is x square
 */
public class Function1 {
    public static void main(String[] args) {
        System.out.println("When x = 5, y is " + calculateY(5));
    }



    public static int calculateY(int x) {
        int y = 0;
        y  = (int) ((4*Math.pow(x,2))-22*x + 129);

        return y;
    }
}

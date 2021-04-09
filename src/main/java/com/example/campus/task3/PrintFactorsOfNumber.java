package com.example.campus.task3;
/*

Write a program to print the factors of the given number. The numbers should be separated by comma.
 */
public class PrintFactorsOfNumber {
    public static void main(String[] args) {
        printFactorsOfNumber(24);
    }

    public static void printFactorsOfNumber(int number)
    {
        for (int i = 1; i <=number ; i++) {
            if(number%i==0){
                System.out.print(i+ ",");
            }
        }

    }
}

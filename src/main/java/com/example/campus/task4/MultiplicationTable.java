package com.example.campus.task4;
/*
Write a program to print the multiplication table of the given number.
 Use System.out.println or System.out.print for printing.
 */
public class MultiplicationTable {

    public static void main(String[] args) {

        printMultiplicationTable(5);

    }

    public static void printMultiplicationTable(int number) {

        for (int i = 1; i <= 10; i++) {
            System.out.println( number + " x " + i + " = " +(number*i));
        }

    }
}

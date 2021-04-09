package com.example.campus.task3;
/*

Write a program to print the following character pyramid using the input string.
 Spaces at the beginning of the line and spaces between characters are important.
 Use System.out.println or System.out.print for printing.
 */
public class PrintFormation {
    public static void main(String[] args) {

        printFormation("India");
    }
    public static void printFormation(String name)
    {
        for (int i = 0; i <= name.length(); i++) {
            for (int j = name.length(); j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" "+ name.charAt(k));
            }

            System.out.println();
        }

    }
}

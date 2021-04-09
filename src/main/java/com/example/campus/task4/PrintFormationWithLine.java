package com.example.campus.task4;
/*

Write a program to print the following formation depending upon size of the matrix.
Use System.out.println or System.out.print for printing.
 */
public class PrintFormationWithLine {
    public static void main(String[] args) {
        printFormation(5);
    }
    public static void printFormation(int size){
        for (int i = 1; i <=size; i++) {
            for (int j = 1; j <=i ; j++) {
                if(i%2==0) {
                    System.out.print("- " );
                }else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
